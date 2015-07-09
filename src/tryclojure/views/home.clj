(ns tryclojure.views.home
  (:require [hiccup.element :refer [javascript-tag link-to unordered-list]]
            [hiccup.page :refer [include-css include-js html5]]
            [hiccup.core :refer [html]]))

(defn root-html []
  (html5
   [:head
    [:meta {:name "viewport" :content "width=device-width, initial-scale=1"}]
    (include-css "/css/tryclojure.css"
                 "/css/gh-fork-ribbon.css")
    (include-js "http://ajax.googleapis.com/ajax/libs/jquery/1.7.2/jquery.min.js"
                "/javascript/jquery-console/jquery.console.js"
                "/javascript/tryclojure.js")
    [:title "Try Clojure"]]
   [:body
    [:div#wrapper
      [:div.github-fork-ribbon-wrapper.right
       [:div.github-fork-ribbon
         (link-to "https://github.com/fiatmoney/tryclojure" "Fork me on GitHub")]]
     [:div#content
      [:div#header
       [:h1
        [:span.logo-try "Try"] " "
        [:span.logo-clojure "Clo" [:em "j"] "ure"]]]
      [:div#container
       [:div#console.console]]]]]))

