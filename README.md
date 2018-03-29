# cljs-npm-deps-test

## legendary-spoon

 - https://www.npmjs.com/package/legendary-spoon
 - npm dep
 - to demonstrate upstream npm-deps version resolution

## verbose-meme

 - https://clojars.org/verbose-meme
 - cljs dep (depending on legendary-spoon@0.0.1)

## bug-free-memory

 - actual project that should compile `lein cljsbuild once min`
 - does not specify `:npm-deps` itself
 - tried with `:install-deps` (no effect)
