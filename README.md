# tryclojure

This modified version of [TryClojure](https://github.com/Raynes/tryclojure) is intended to be used as the base of general web-accessible Clojure REPL applications.  Think of it as an alternative to, for instance, SSH-ing into a server and running a ncurses-based application.

## Usage

To run it locally, use `lein ring server`.

## Credits

apgwoz: Design

Raynes: TryClojure

## License

Licensed under the same thing Clojure is licensed under: the EPL, of which you can find a copy at the root of this directory.

## Todo

- Keepalive to prevent namespace removal when still in use
- Document steps to modify & use with your own namespace, limited file access, etc.
- Helper functions
