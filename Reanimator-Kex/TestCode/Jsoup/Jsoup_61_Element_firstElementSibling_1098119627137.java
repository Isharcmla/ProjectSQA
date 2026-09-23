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
import java.lang.NullPointerException;
import static org.jsoup.nodes.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.ArrayList;
import java.util.LinkedHashMap;

public class Element_firstElementSibling_1098119627137 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3050;

    public Element_firstElementSibling_1098119627137() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term3072 = new ArrayList();
        LinkedHashMap term3077 = new LinkedHashMap();
        term3050 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term3051 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term3076 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term3051, term3051.getClass(), "tagName", "NnpwZBUTvx");
        setBooleanField(term3051, term3051.getClass(), "isBlock", true);
        setBooleanField(term3051, term3051.getClass(), "formatAsBlock", true);
        setBooleanField(term3051, term3051.getClass(), "canContainInline", false);
        setBooleanField(term3051, term3051.getClass(), "empty", false);
        setBooleanField(term3051, term3051.getClass(), "selfClosing", true);
        setBooleanField(term3051, term3051.getClass(), "preserveWhitespace", true);
        setBooleanField(term3051, term3051.getClass(), "formList", false);
        setBooleanField(term3051, term3051.getClass(), "formSubmit", true);
        setField(term3050, term3050.getClass(), "tag", term3051);
        setField(term3050, term3050.getClass(), "parentNode", null);
        setField(term3050, term3050.getClass(), "childNodes", term3072);
        setField(term3076, term3076.getClass(), "attributes", term3077);
        setField(term3050, term3050.getClass(), "attributes", term3076);
        setField(term3050, term3050.getClass(), "baseUri", "GrqozDKFOk");
        setIntField(term3050, term3050.getClass(), "siblingIndex", 1962444399);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "firstElementSibling", argTypes, term3050, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


