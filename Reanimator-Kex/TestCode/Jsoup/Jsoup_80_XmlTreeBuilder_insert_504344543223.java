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

public class XmlTreeBuilder_insert_504344543223 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term292292;
     Object term292424;

    public XmlTreeBuilder_insert_504344543223() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term292292 = newInstance(Class.forName("org.jsoup.parser.XmlTreeBuilder"));
        Object term292358 = newInstance(Class.forName("org.jsoup.parser.ParseSettings"));
        setBooleanField(term292358, term292358.getClass(), "preserveTagCase", false);
        setField(term292292, term292292.getClass(), "settings", term292358);
        char[] term291869 = (char[]) newCharArray(0);
        StringBuilder term292484 = new StringBuilder();
        ((StringBuilder) term292484).append(term291869);
        StringBuilder term292544 = new StringBuilder();
        char[] term291888 = (char[]) newCharArray(0);
        StringBuilder term292604 = new StringBuilder();
        ((StringBuilder) term292604).append(term291888);
        term292424 = newInstance(Class.forName("org.jsoup.parser.Token$Doctype"));
        setField(term292424, term292424.getClass(), "name", term292484);
        setField(term292424, term292424.getClass(), "publicIdentifier", term292544);
        setField(term292424, term292424.getClass(), "systemIdentifier", term292604);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.XmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token$Doctype");
        Object[] args = new Object[1];
        args[0] = term292424;
        try {
            callMethod(klass, "insert", argTypes, term292292, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


