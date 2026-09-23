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
import java.lang.IllegalArgumentException;
import static org.jsoup.parser.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.StringBuilder;

public class XmlTreeBuilder_insert_50434454351 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term45879;
     Object term45945;

    public XmlTreeBuilder_insert_50434454351() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term45879 = newInstance(Class.forName("org.jsoup.parser.XmlTreeBuilder"));
        setField(term45879, term45879.getClass(), "baseUri", null);
        char[] term45442 = (char[]) newCharArray(0);
        StringBuilder term46005 = new StringBuilder();
        ((StringBuilder) term46005).append(term45442);
        char[] term45446 = (char[]) newCharArray(105);
        StringBuilder term46065 = new StringBuilder();
        ((StringBuilder) term46065).append(term45446);
        StringBuilder term46125 = new StringBuilder();
        term45945 = newInstance(Class.forName("org.jsoup.parser.Token$Doctype"));
        setField(term45945, term45945.getClass(), "name", term46005);
        setField(term45945, term45945.getClass(), "publicIdentifier", term46065);
        setField(term45945, term45945.getClass(), "systemIdentifier", term46125);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.XmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token$Doctype");
        Object[] args = new Object[1];
        args[0] = term45945;
        try {
            callMethod(klass, "insert", argTypes, term45879, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


