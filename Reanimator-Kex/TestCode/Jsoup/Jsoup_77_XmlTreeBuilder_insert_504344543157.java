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

public class XmlTreeBuilder_insert_504344543157 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term281899;
     Object term282031;

    public XmlTreeBuilder_insert_504344543157() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term281899 = newInstance(Class.forName("org.jsoup.parser.XmlTreeBuilder"));
        Object term281965 = newInstance(Class.forName("org.jsoup.parser.ParseSettings"));
        setBooleanField(term281965, term281965.getClass(), "preserveTagCase", true);
        setField(term281899, term281899.getClass(), "settings", term281965);
        StringBuilder term282091 = new StringBuilder();
        StringBuilder term282151 = new StringBuilder();
        char[] term281621 = (char[]) newCharArray(2);
        setCharElement(term281621, 0, (char) 128);
        setCharElement(term281621, 1, 'e');
        StringBuilder term282211 = new StringBuilder();
        ((StringBuilder) term282211).append(term281621);
        term282031 = newInstance(Class.forName("org.jsoup.parser.Token$Doctype"));
        setField(term282031, term282031.getClass(), "name", term282091);
        setField(term282031, term282031.getClass(), "publicIdentifier", term282151);
        setField(term282031, term282031.getClass(), "systemIdentifier", term282211);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.XmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token$Doctype");
        Object[] args = new Object[1];
        args[0] = term282031;
        try {
            callMethod(klass, "insert", argTypes, term281899, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


