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
import java.lang.ClassCastException;
import static org.jsoup.nodes.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.ArrayList;

public class Document_normaliseStructure_72252192055 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term24460;

    public Document_normaliseStructure_72252192055() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        byte[] term24325 = (byte[]) newByteArray(0);
        ArrayList term24596 = new ArrayList();
        ((ArrayList) term24596).add(term24325);
        term24460 = newInstance(Class.forName("org.jsoup.nodes.Document"));
        Object term24506 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term24506, term24506.getClass(), "tagName", "        ");
        setField(term24460, term24460.getClass(), "tag", term24506);
        setField(term24460, term24460.getClass(), "childNodes", term24596);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Document");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("org.jsoup.nodes.Element");
        Object[] args = new Object[2];
        args[0] = "          ";
        args[1] = null;
        try {
            callMethod(klass, "normaliseStructure", argTypes, term24460, args);
            assertTrue(false);
        }
        catch (ClassCastException e) {
        }

    }

};


