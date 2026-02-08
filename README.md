# CDI勉強会 TIPS02 同クラス内のメソッドを呼び出すとインターセプターが掛からない  

## セットアップ

1. git cloneする。

```
git clone https://github.com/jjugnsjeecditips202602/febtips02.git
```

2. ビルドする

```
cd febtips02
mvn clean package
```

targetフォルダ直下に「febtips02-0.0.1-SNAPSHOT.war」が作成されていることを確認

3. WildFlyまたはJBoss EAPにwarをデプロイ

jboss-cliまたは管理コンソールでwarをデプロイする。

jboss-cliでデプロイする際のコマンド例

```
deploy C:\dev\febtips02\target\febtips02-0.0.1-SNAPSHOT.war --force
```

APサーバーの標準出力に次のような文言が表示されることを確認

```
18:24:12,521 INFO  [org.jboss.as.server.deployment] (MSC service thread 1-2) WFLYSRV0027: "febtips02-0.0.1-SNAPSHOT.war" (runtime-name: "febtips02-0.0.1-SNAPSHOT.war") のデプロイメントを開始しました。
18:24:13,808 INFO  [org.jboss.weld.deployer] (MSC service thread 1-2) WFLYWELD0003: Weld デプロイメント febtips02-0.0.1-SNAPSHOT.war を処理しています
18:24:14,352 INFO  [org.jboss.resteasy.resteasy_jaxrs.i18n] (ServerService Thread Pool -- 101) RESTEASY002225: Deploying jakarta.ws.rs.core.Application: class io.github.futokiyo.febtips02.rest.JakartaRESTActivator
18:24:14,357 INFO  [org.wildfly.extension.undertow] (ServerService Thread Pool -- 101) WFLYUT0021: 登録された web コンテキスト: '/febtips02-0.0.1-SNAPSHOT' (サーバー 'default-server' 用)
18:24:14,455 INFO  [org.jboss.as.server] (management-handler-thread - 6) WFLYSRV0016: デプロイメント "febtips02-0.0.1-SNAPSHOT.war" がデプロイメント "febtips02-0.0.1-SNAPSHOT.war" に置き換えられました。
```


## 動作確認

ブラウザのURLに、
```
http://localhost:8080/febtips02-0.0.1-SNAPSHOT/rest2/learn
```
と打ち込み、「HelloTips02 # L」が表示されることを確認。コンソールのログに、#study start.は表示されるが、#prepare start.のログが表示されないことを確認。



次に、ブラウザのURLに、
```
http://localhost:8080/febtips02-0.0.1-SNAPSHOT/rest2/prepare
```

と打ち込み、「HelloTips02 # P」が表示されることを確認。コンソールのログに、#prepare start.のログが表示されることを確認。


