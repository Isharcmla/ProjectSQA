package org.jsoup.nodes;

import java.lang.Throwable;
import java.lang.IllegalStateException;
import org.junit.Test;
import org.junit.Rule;
import org.junit.rules.Timeout;
import java.util.concurrent.TimeUnit;
import org.junit.Before;
import java.lang.Class;
import java.lang.reflect.Method;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.Stream;
import java.util.stream.Collectors;
import static org.jsoup.nodes.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.ArrayList;
import java.util.LinkedHashMap;

public class Element_html_133278088992 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8079;

    public Element_html_133278088992() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term8101 = new ArrayList();
        ((ArrayList) term8101).add((Object)null);
        ((ArrayList) term8101).add((Object)null);
        ((ArrayList) term8101).add((Object)null);
        ((ArrayList) term8101).add((Object)null);
        ((ArrayList) term8101).add((Object)null);
        LinkedHashMap term8106 = new LinkedHashMap();
        term8079 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term8080 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term8105 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term8080, term8080.getClass(), "tagName", "BWxJSgKHRT");
        setBooleanField(term8080, term8080.getClass(), "isBlock", false);
        setBooleanField(term8080, term8080.getClass(), "formatAsBlock", false);
        setBooleanField(term8080, term8080.getClass(), "canContainInline", true);
        setBooleanField(term8080, term8080.getClass(), "empty", false);
        setBooleanField(term8080, term8080.getClass(), "selfClosing", false);
        setBooleanField(term8080, term8080.getClass(), "preserveWhitespace", true);
        setBooleanField(term8080, term8080.getClass(), "formList", true);
        setBooleanField(term8080, term8080.getClass(), "formSubmit", false);
        setField(term8079, term8079.getClass(), "tag", term8080);
        setField(term8079, term8079.getClass(), "parentNode", null);
        setField(term8079, term8079.getClass(), "childNodes", term8101);
        setField(term8105, term8105.getClass(), "attributes", term8106);
        setField(term8079, term8079.getClass(), "attributes", term8105);
        setField(term8079, term8079.getClass(), "baseUri", "MRFLbEGYKG");
        setIntField(term8079, term8079.getClass(), "siblingIndex", 729658803);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Appendable");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "html", argTypes, term8079, args);
    }

};


