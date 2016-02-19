# cljsbuild-trampoline

Minimal project to reproduce [lein-cljsbuild issue 204](https://github.com/emezeske/lein-cljsbuild/issues/204).

Run the following to reproduce the problem:

```
lein trampoline do cljsbuild once dev, test
```

## License

Distributed under the MIT License (MIT)
