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

public class Element_toggleClass_95262400085 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6961;

    public Element_toggleClass_95262400085() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term6983 = new ArrayList();
        ((ArrayList) term6983).add((Object)null);
        ((ArrayList) term6983).add((Object)null);
        LinkedHashMap term6988 = new LinkedHashMap();
        term6961 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term6962 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term6987 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term6962, term6962.getClass(), "tagName", "mKaHyMybrK");
        setBooleanField(term6962, term6962.getClass(), "isBlock", false);
        setBooleanField(term6962, term6962.getClass(), "formatAsBlock", true);
        setBooleanField(term6962, term6962.getClass(), "canContainInline", true);
        setBooleanField(term6962, term6962.getClass(), "empty", false);
        setBooleanField(term6962, term6962.getClass(), "selfClosing", false);
        setBooleanField(term6962, term6962.getClass(), "preserveWhitespace", true);
        setBooleanField(term6962, term6962.getClass(), "formList", false);
        setBooleanField(term6962, term6962.getClass(), "formSubmit", true);
        setField(term6961, term6961.getClass(), "tag", term6962);
        setField(term6961, term6961.getClass(), "parentNode", null);
        setField(term6961, term6961.getClass(), "childNodes", term6983);
        setField(term6987, term6987.getClass(), "attributes", term6988);
        setField(term6961, term6961.getClass(), "attributes", term6987);
        setField(term6961, term6961.getClass(), "baseUri", "DSFGlcaXUb");
        setIntField(term6961, term6961.getClass(), "siblingIndex", -2066804303);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "sHMXNUzNeM";
        callMethod(klass, "toggleClass", argTypes, term6961, args);
    }

};


