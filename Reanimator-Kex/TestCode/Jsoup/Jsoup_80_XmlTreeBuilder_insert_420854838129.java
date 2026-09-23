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

public class XmlTreeBuilder_insert_420854838129 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term237041;
     Object term237273;

    public XmlTreeBuilder_insert_420854838129() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term237131 = newInstance(Class.forName("java.lang.Object"));
        Object term237203 = newInstance(Class.forName("org.jsoup.nodes.PseudoTextElement"));
        ArrayList term237093 = new ArrayList();
        ((ArrayList) term237093).add(term237131);
        ((ArrayList) term237093).add(term237131);
        ((ArrayList) term237093).add(term237131);
        ((ArrayList) term237093).add(term237131);
        ((ArrayList) term237093).add(term237131);
        ((ArrayList) term237093).add(term237131);
        ((ArrayList) term237093).add(term237131);
        ((ArrayList) term237093).add(term237203);
        term237041 = newInstance(Class.forName("org.jsoup.parser.XmlTreeBuilder"));
        setField(term237041, term237041.getClass(), "stack", term237093);
        term237273 = newInstance(Class.forName("org.jsoup.parser.Token$Character"));
        setField(term237273, term237273.getClass(), "data", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.XmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token$Character");
        Object[] args = new Object[1];
        args[0] = term237273;
        try {
            callMethod(klass, "insert", argTypes, term237041, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


