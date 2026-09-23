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
import java.lang.Object;

public class XmlTreeBuilder_insert_420854838217 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term279892;
     Object term280112;

    public XmlTreeBuilder_insert_420854838217() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term279982 = newInstance(Class.forName("java.lang.Object"));
        Object term280042 = newInstance(Class.forName("org.jsoup.nodes.FormElement"));
        ArrayList term279944 = new ArrayList();
        ((ArrayList) term279944).add(term279982);
        ((ArrayList) term279944).add(term279982);
        ((ArrayList) term279944).add(term279982);
        ((ArrayList) term279944).add(term279982);
        ((ArrayList) term279944).add(term279982);
        ((ArrayList) term279944).add(term279982);
        ((ArrayList) term279944).add(term279982);
        ((ArrayList) term279944).add(term280042);
        term279892 = newInstance(Class.forName("org.jsoup.parser.XmlTreeBuilder"));
        setField(term279892, term279892.getClass(), "stack", term279944);
        term280112 = newInstance(Class.forName("org.jsoup.parser.Token$Character"));
        setField(term280112, term280112.getClass(), "data", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.XmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token$Character");
        Object[] args = new Object[1];
        args[0] = term280112;
        try {
            callMethod(klass, "insert", argTypes, term279892, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


