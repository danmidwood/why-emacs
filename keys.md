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

    C-a       ;; Move cursor to beginning of line
    C-e       ;; Move cursor to end of line

    C-p       ;; Move cursor to previous line
    C-n       ;; Move cursor to next line

## Editing

    C-d       ;; Delete a character forwards
    Del       ;; Delete a character backwards

    M-d       ;; Delete a word forwards
    M-Del     ;; Delete a word backwards

    C-k       ;; Kill (delete) to the end of the line

    C-Space   ;; Set a mark / Start a selection of a region

    C-w       ;; Kill (Cut) the selected region

    C-y       ;; Yank (Paste)
    M-y       ;; Yank (Paste) previous

    M-w       ;; Save (Copy) the selected region

    C-_       ;; Undo

    C-M-\     ;; Indent selected region

    C-x h     ;; Select entire buffer


## Getting help

    C-h ?     ;; Show available help information, all help shortcuts start C-h
    C-h m     ;; describe the current buffer's enabled modes
    C-h f     ;; describe function
    C-h v     ;; describe variable
    C-h k     ;; (followed by some keys) describe what the pressed keys do

# Clojure

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

    C-)       ;; "Slurp" forwards
    C-(       ;; "Slurp" backwards

    C-}       ;; "Barf" forwards
    C-{       ;; "Barf" backwards

Paredit provides a lot more cool functionality, check out this blog post for
more info:

http://danmidwood.com/content/2014/11/21/animated-paredit.html


## Cider

### Starting, managing, stopping

Clojure Interactive Development Environment that Rocks

    C-c M-j   ;; Start a REPL in the current project

    C-c C-x   ;; Refresh Cider (unload and reload everything)

    C-c C-q   ;; Quit Cider, close the repl connection

### REPL Basics

Type things in REPL, and then hit enter to evaluate them.

    C-c C-z   ;; Switch from clj file to the repl (and back)

    C-c M-p   ;; Copy the preceding form to the repl buffer

    C-c M-n   ;; Set the repl namespace to the current file

    C-c M-n   ;; (Inside the repl buffer) to change to another namespace

    C-c C-d d ;; Print the docs for the current form in a new buffer

    C-c C-d a ;; Search for a fn and display docs, useful if you're not sure of
              ;; a function name

    C-M-i     ;; Auto complete


### Navigation

Cider provides navigation through namespaces and symbols (fns/vars)

    M-.       ;; Navigate to namespace or symbol under cursor
    M-,       ;; Navigate backwards


### Interacting with the repl without using the repl

Since Emacs knows that we're connected to the repl, we can do some cool things

    C-c C-k   ;; Load the buffer into the repl

    C-c C-e   ;; Evaluate the previous sexp inline (showing the result in the
                 same buffer)

    C-c C-p   ;; Evaluate the previous sexp, and pretty print the result in a
              ;; new buffer
