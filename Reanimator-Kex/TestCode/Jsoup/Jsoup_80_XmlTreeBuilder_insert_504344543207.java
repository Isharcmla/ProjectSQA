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

public class XmlTreeBuilder_insert_504344543207 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term281369;
     Object term281501;

    public XmlTreeBuilder_insert_504344543207() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term281369 = newInstance(Class.forName("org.jsoup.parser.XmlTreeBuilder"));
        Object term281435 = newInstance(Class.forName("org.jsoup.parser.ParseSettings"));
        setBooleanField(term281435, term281435.getClass(), "preserveTagCase", false);
        setField(term281369, term281369.getClass(), "settings", term281435);
        StringBuilder term281561 = new StringBuilder();
        char[] term280918 = (char[]) newCharArray(16);
        StringBuilder term281621 = new StringBuilder();
        ((StringBuilder) term281621).append(term280918);
        StringBuilder term281681 = new StringBuilder();
        term281501 = newInstance(Class.forName("org.jsoup.parser.Token$Doctype"));
        setField(term281501, term281501.getClass(), "name", term281561);
        setField(term281501, term281501.getClass(), "publicIdentifier", term281621);
        setField(term281501, term281501.getClass(), "systemIdentifier", term281681);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.XmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token$Doctype");
        Object[] args = new Object[1];
        args[0] = term281501;
        try {
            callMethod(klass, "insert", argTypes, term281369, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


