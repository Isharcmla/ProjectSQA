package org.jsoup.parser;

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
import static org.jsoup.parser.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.StringBuilder;

public class XmlTreeBuilder_insert_504344543342 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term348590;
     Object term348722;

    public XmlTreeBuilder_insert_504344543342() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term348590 = newInstance(Class.forName("org.jsoup.parser.XmlTreeBuilder"));
        Object term348656 = newInstance(Class.forName("org.jsoup.parser.ParseSettings"));
        setBooleanField(term348656, term348656.getClass(), "preserveTagCase", false);
        setField(term348590, term348590.getClass(), "settings", term348656);
        StringBuilder term348782 = new StringBuilder();
        char[] term348243 = (char[]) newCharArray(2);
        StringBuilder term348842 = new StringBuilder();
        ((StringBuilder) term348842).append(term348243);
        StringBuilder term348902 = new StringBuilder();
        term348722 = newInstance(Class.forName("org.jsoup.parser.Token$Doctype"));
        setField(term348722, term348722.getClass(), "name", term348782);
        setField(term348722, term348722.getClass(), "publicIdentifier", term348842);
        setField(term348722, term348722.getClass(), "systemIdentifier", term348902);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.XmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token$Doctype");
        Object[] args = new Object[1];
        args[0] = term348722;
        try {
            callMethod(klass, "insert", argTypes, term348590, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


