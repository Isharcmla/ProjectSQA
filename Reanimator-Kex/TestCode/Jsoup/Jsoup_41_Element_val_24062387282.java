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

public class Element_val_24062387282 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6872;

    public Element_val_24062387282() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term6895 = new ArrayList();
        ((ArrayList) term6895).add((Object)null);
        ((ArrayList) term6895).add((Object)null);
        ((ArrayList) term6895).add((Object)null);
        ((ArrayList) term6895).add((Object)null);
        ((ArrayList) term6895).add((Object)null);
        ((ArrayList) term6895).add((Object)null);
        LinkedHashMap term6900 = new LinkedHashMap();
        term6872 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term6873 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term6899 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term6873, term6873.getClass(), "tagName", "aSATgQUpoe");
        setBooleanField(term6873, term6873.getClass(), "isBlock", false);
        setBooleanField(term6873, term6873.getClass(), "formatAsBlock", false);
        setBooleanField(term6873, term6873.getClass(), "canContainBlock", true);
        setBooleanField(term6873, term6873.getClass(), "canContainInline", false);
        setBooleanField(term6873, term6873.getClass(), "empty", true);
        setBooleanField(term6873, term6873.getClass(), "selfClosing", true);
        setBooleanField(term6873, term6873.getClass(), "preserveWhitespace", true);
        setBooleanField(term6873, term6873.getClass(), "formList", false);
        setBooleanField(term6873, term6873.getClass(), "formSubmit", true);
        setField(term6872, term6872.getClass(), "tag", term6873);
        setField(term6872, term6872.getClass(), "parentNode", null);
        setField(term6872, term6872.getClass(), "childNodes", term6895);
        setField(term6899, term6899.getClass(), "attributes", term6900);
        setField(term6872, term6872.getClass(), "attributes", term6899);
        setField(term6872, term6872.getClass(), "baseUri", "uSlMeISsDD");
        setIntField(term6872, term6872.getClass(), "siblingIndex", 1398204340);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "val", argTypes, term6872, args);
    }

};


