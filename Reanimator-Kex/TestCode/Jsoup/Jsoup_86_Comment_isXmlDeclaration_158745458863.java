package org.jsoup.nodes;

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
import java.lang.ArrayIndexOutOfBoundsException;
import static org.jsoup.nodes.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class Comment_isXmlDeclaration_158745458863 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term210330;

    public Comment_isXmlDeclaration_158745458863() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term210330 = newInstance(Class.forName("org.jsoup.nodes.Comment"));
        Object term210388 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term210247 = (Object[]) newArray("java.lang.String", 0);
        setIntField(term210388, term210388.getClass(), "size", 1);
        setField(term210388, term210388.getClass(), "keys", term210247);
        setField(term210330, term210330.getClass(), "value", term210388);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Comment");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "isXmlDeclaration", argTypes, term210330, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


