# Emacs

## Key stroke terminology

    C-x      ;; Control + x
    M-x      ;;  Meta + x  --  Meta is the Alt key, on Macs the Option key

Many people bind the Caps Lock key to send Control for better ergonomics

## Display / Files / Buffers

Frames, Windows, Buffers, Files

    C-x 0     ;; Delete window
    C-x 1     ;; Delete all other windows
    C-x 2     ;; Split window horizontally, one above the other
    C-x 3     ;; Split window vertically, side by side

    C-x C-f   ;; Open file
    C-x b     ;; Switch to a buffer
    C-x k     ;; Kill (Close) a buffer

    C-x o     ;; Switch to the next window

## Cursor Movement

    C-f       ;; Move cursor forward 1 letter
    C-b       ;; Move cursor backward 1 letter

    M-f       ;; Move cursor forward 1 word
    M-b       ;; Move cursor backward 1 word

    C-p       ;; Move cursor to previous line
    C-n       ;; Move cursor to next line

## Getting help

    C-h ?     ;; Show available help information, all help shortcuts start C-h
    C-h f     ;; describe function
    C-h v     ;; describe variable
    C-h k     ;; (followed by some keys) describe what the pressed keys do

## Elisp config

Not important for this talk... but I'll use it to incrementally configure emacs

    C-x C-e   ;; eval the previous s-exp
    C-M-x     ;; eval the current topmost s-exp

# Clojure
## Clojure Mode

Provides indentation, syntax highlighting

## Paredit

Structural editing and navigation

### Movement

    C-M-f     ;; Move forward 1 s-expression
    C-M-b     ;; Move backwards 1 s-expression

    C-M-d     ;; Descend, forwards
    C-M-u     ;; Ascend, backwards

    C-M-p     ;; Descend, backwards
    C-M-n     ;; Ascend, forwards

### Editing

Paredit will not allow unbalanced parenthesis

    Del       ;; Delete backwards, descends into s-exps. (bound to backspace)
    C-d       ;; Delete forwards, descends into s-exps
    M-Del     ;; Delete backwards a word, descends..
    M-d       ;; Delete forwards a word, descends..

    C-k       ;; Kill forward, remove full s-expression

    (, [ & {  ;; Add a new sexp, auto adds a closing parameter


Paredit provides a lot more cool functionality, check out this blog post for
more info:

http://danmidwood.com/content/2014/11/21/animated-paredit.html
