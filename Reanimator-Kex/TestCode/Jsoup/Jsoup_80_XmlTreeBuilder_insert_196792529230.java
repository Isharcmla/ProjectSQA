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
import java.lang.ClassCastException;
import static org.jsoup.parser.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.lang.Object;
import java.lang.StringBuilder;

public class XmlTreeBuilder_insert_196792529230 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term171882;
     Object term172038;

    public XmlTreeBuilder_insert_196792529230() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term171972 = newInstance(Class.forName("java.lang.Object"));
        ArrayList term171934 = new ArrayList();
        ((ArrayList) term171934).add(term171972);
        term171882 = newInstance(Class.forName("org.jsoup.parser.XmlTreeBuilder"));
        setField(term171882, term171882.getClass(), "stack", term171934);
        char[] term171737 = (char[]) newCharArray(0);
        StringBuilder term172098 = new StringBuilder();
        ((StringBuilder) term172098).append(term171737);
        term172038 = newInstance(Class.forName("org.jsoup.parser.Token$Comment"));
        setField(term172038, term172038.getClass(), "data", term172098);
        setBooleanField(term172038, term172038.getClass(), "bogus", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.XmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token$Comment");
        Object[] args = new Object[1];
        args[0] = term172038;
        try {
            callMethod(klass, "insert", argTypes, term171882, args);
            assertTrue(false);
        }
        catch (ClassCastException e) {
        }

    }

};


