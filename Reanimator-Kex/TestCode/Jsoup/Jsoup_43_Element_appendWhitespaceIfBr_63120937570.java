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

public class Element_appendWhitespaceIfBr_63120937570 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5927;
     Object term5979;

    public Element_appendWhitespaceIfBr_63120937570() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term5950 = new ArrayList();
        ((ArrayList) term5950).add((Object)null);
        LinkedHashMap term5955 = new LinkedHashMap();
        term5927 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term5928 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term5954 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term5928, term5928.getClass(), "tagName", "mGRiYhnMcR");
        setBooleanField(term5928, term5928.getClass(), "isBlock", true);
        setBooleanField(term5928, term5928.getClass(), "formatAsBlock", true);
        setBooleanField(term5928, term5928.getClass(), "canContainBlock", true);
        setBooleanField(term5928, term5928.getClass(), "canContainInline", true);
        setBooleanField(term5928, term5928.getClass(), "empty", true);
        setBooleanField(term5928, term5928.getClass(), "selfClosing", false);
        setBooleanField(term5928, term5928.getClass(), "preserveWhitespace", true);
        setBooleanField(term5928, term5928.getClass(), "formList", false);
        setBooleanField(term5928, term5928.getClass(), "formSubmit", true);
        setField(term5927, term5927.getClass(), "tag", term5928);
        setField(term5927, term5927.getClass(), "parentNode", null);
        setField(term5927, term5927.getClass(), "childNodes", term5950);
        setField(term5954, term5954.getClass(), "attributes", term5955);
        setField(term5927, term5927.getClass(), "attributes", term5954);
        setField(term5927, term5927.getClass(), "baseUri", "MgLCedQfoj");
        setIntField(term5927, term5927.getClass(), "siblingIndex", -1697741339);
        term5979 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term5980 = (byte[]) newByteArray(16);
        setField(term5979, term5979.getClass(), "value", term5980);
        setByteField(term5979, term5979.getClass(), "coder", (byte) 89);
        setIntField(term5979, term5979.getClass(), "count", 98922530);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.jsoup.nodes.Element");
        argTypes[1] = Class.forName("java.lang.StringBuilder");
        Object[] args = new Object[2];
        args[0] = term5927;
        args[1] = term5979;
        callMethod(klass, "appendWhitespaceIfBr", argTypes, null, args);
    }

};


