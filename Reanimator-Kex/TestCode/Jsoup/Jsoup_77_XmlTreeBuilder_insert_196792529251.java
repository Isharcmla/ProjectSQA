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
import java.util.ArrayList;
import java.lang.StringBuilder;

public class XmlTreeBuilder_insert_196792529251 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term195722;
     Object term195840;

    public XmlTreeBuilder_insert_196792529251() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term195774 = new ArrayList();
        term195722 = newInstance(Class.forName("org.jsoup.parser.XmlTreeBuilder"));
        setField(term195722, term195722.getClass(), "stack", term195774);
        char[] term194154 = (char[]) newCharArray(489);
        StringBuilder term195900 = new StringBuilder();
        ((StringBuilder) term195900).append(term194154);
        term195840 = newInstance(Class.forName("org.jsoup.parser.Token$Comment"));
        setField(term195840, term195840.getClass(), "data", term195900);
        setBooleanField(term195840, term195840.getClass(), "bogus", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.XmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token$Comment");
        Object[] args = new Object[1];
        args[0] = term195840;
        try {
            callMethod(klass, "insert", argTypes, term195722, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


