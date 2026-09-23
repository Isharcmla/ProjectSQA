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

public class XmlTreeBuilder_insert_504344543272 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term428479;
     Object term428611;

    public XmlTreeBuilder_insert_504344543272() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term428479 = newInstance(Class.forName("org.jsoup.parser.XmlTreeBuilder"));
        Object term428545 = newInstance(Class.forName("org.jsoup.parser.ParseSettings"));
        setBooleanField(term428545, term428545.getClass(), "preserveTagCase", true);
        setField(term428479, term428479.getClass(), "settings", term428545);
        char[] term427976 = (char[]) newCharArray(0);
        StringBuilder term428671 = new StringBuilder();
        ((StringBuilder) term428671).append(term427976);
        char[] term427988 = (char[]) newCharArray(32);
        StringBuilder term428731 = new StringBuilder();
        ((StringBuilder) term428731).append(term427988);
        StringBuilder term428791 = new StringBuilder();
        ((StringBuilder) term428791).append(term427976);
        term428611 = newInstance(Class.forName("org.jsoup.parser.Token$Doctype"));
        setField(term428611, term428611.getClass(), "name", term428671);
        setField(term428611, term428611.getClass(), "publicIdentifier", term428731);
        setField(term428611, term428611.getClass(), "systemIdentifier", term428791);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.XmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token$Doctype");
        Object[] args = new Object[1];
        args[0] = term428611;
        try {
            callMethod(klass, "insert", argTypes, term428479, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


