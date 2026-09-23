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

public class Element_appendWhitespaceIfBr_63120937574 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6120;
     Object term6171;

    public Element_appendWhitespaceIfBr_63120937574() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term6142 = new ArrayList();
        ((ArrayList) term6142).add((Object)null);
        LinkedHashMap term6147 = new LinkedHashMap();
        term6120 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term6121 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term6146 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term6121, term6121.getClass(), "tagName", "boSSpezHeU");
        setBooleanField(term6121, term6121.getClass(), "isBlock", false);
        setBooleanField(term6121, term6121.getClass(), "formatAsBlock", false);
        setBooleanField(term6121, term6121.getClass(), "canContainInline", false);
        setBooleanField(term6121, term6121.getClass(), "empty", true);
        setBooleanField(term6121, term6121.getClass(), "selfClosing", true);
        setBooleanField(term6121, term6121.getClass(), "preserveWhitespace", false);
        setBooleanField(term6121, term6121.getClass(), "formList", false);
        setBooleanField(term6121, term6121.getClass(), "formSubmit", true);
        setField(term6120, term6120.getClass(), "tag", term6121);
        setField(term6120, term6120.getClass(), "parentNode", null);
        setField(term6120, term6120.getClass(), "childNodes", term6142);
        setField(term6146, term6146.getClass(), "attributes", term6147);
        setField(term6120, term6120.getClass(), "attributes", term6146);
        setField(term6120, term6120.getClass(), "baseUri", "sOdkipUKRu");
        setIntField(term6120, term6120.getClass(), "siblingIndex", -243422082);
        term6171 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term6172 = (byte[]) newByteArray(16);
        setField(term6171, term6171.getClass(), "value", term6172);
        setByteField(term6171, term6171.getClass(), "coder", (byte) 89);
        setIntField(term6171, term6171.getClass(), "count", 1384592638);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.jsoup.nodes.Element");
        argTypes[1] = Class.forName("java.lang.StringBuilder");
        Object[] args = new Object[2];
        args[0] = term6120;
        args[1] = term6171;
        callMethod(klass, "appendWhitespaceIfBr", argTypes, null, args);
    }

};


