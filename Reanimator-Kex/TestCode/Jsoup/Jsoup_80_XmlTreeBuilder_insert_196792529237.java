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
import java.lang.StringBuilder;

public class XmlTreeBuilder_insert_196792529237 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term175458;
     Object term175524;

    public XmlTreeBuilder_insert_196792529237() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term175458 = newInstance(Class.forName("org.jsoup.parser.XmlTreeBuilder"));
        char[] term173890 = (char[]) newCharArray(489);
        StringBuilder term175584 = new StringBuilder();
        ((StringBuilder) term175584).append(term173890);
        term175524 = newInstance(Class.forName("org.jsoup.parser.Token$Comment"));
        setField(term175524, term175524.getClass(), "data", term175584);
        setBooleanField(term175524, term175524.getClass(), "bogus", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.XmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token$Comment");
        Object[] args = new Object[1];
        args[0] = term175524;
        try {
            callMethod(klass, "insert", argTypes, term175458, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


