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

public class XmlTreeBuilder_insert_50434454399 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term223422;
     Object term223554;

    public XmlTreeBuilder_insert_50434454399() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term223422 = newInstance(Class.forName("org.jsoup.parser.XmlTreeBuilder"));
        Object term223488 = newInstance(Class.forName("org.jsoup.parser.ParseSettings"));
        setBooleanField(term223488, term223488.getClass(), "preserveTagCase", true);
        setField(term223422, term223422.getClass(), "settings", term223488);
        char[] term222686 = (char[]) newCharArray(32);
        StringBuilder term223614 = new StringBuilder();
        ((StringBuilder) term223614).append(term222686);
        StringBuilder term223674 = new StringBuilder();
        term223554 = newInstance(Class.forName("org.jsoup.parser.Token$Doctype"));
        setField(term223554, term223554.getClass(), "name", term223614);
        setField(term223554, term223554.getClass(), "publicIdentifier", term223674);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.XmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token$Doctype");
        Object[] args = new Object[1];
        args[0] = term223554;
        try {
            callMethod(klass, "insert", argTypes, term223422, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


