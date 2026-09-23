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

public class XmlTreeBuilder_insert_504344543304 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term334787;
     Object term334919;

    public XmlTreeBuilder_insert_504344543304() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term334787 = newInstance(Class.forName("org.jsoup.parser.XmlTreeBuilder"));
        Object term334853 = newInstance(Class.forName("org.jsoup.parser.ParseSettings"));
        setBooleanField(term334853, term334853.getClass(), "preserveTagCase", false);
        setField(term334787, term334787.getClass(), "settings", term334853);
        char[] term334431 = (char[]) newCharArray(0);
        StringBuilder term334979 = new StringBuilder();
        ((StringBuilder) term334979).append(term334431);
        StringBuilder term335039 = new StringBuilder();
        term334919 = newInstance(Class.forName("org.jsoup.parser.Token$Doctype"));
        setField(term334919, term334919.getClass(), "name", term334979);
        setField(term334919, term334919.getClass(), "publicIdentifier", term335039);
        setField(term334919, term334919.getClass(), "systemIdentifier", term334979);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.XmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token$Doctype");
        Object[] args = new Object[1];
        args[0] = term334919;
        try {
            callMethod(klass, "insert", argTypes, term334787, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


