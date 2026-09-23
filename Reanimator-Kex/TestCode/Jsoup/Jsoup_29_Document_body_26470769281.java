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
import java.util.ArrayList;
import java.lang.Object;

public class Document_body_26470769281 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term34665;

    public Document_body_26470769281() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term34717 = new ArrayList();
        ((ArrayList) term34717).add("body");
        ((ArrayList) term34717).add((Object)null);
        ((ArrayList) term34717).add((Object)null);
        ((ArrayList) term34717).add((Object)null);
        ((ArrayList) term34717).add((Object)null);
        ((ArrayList) term34717).add((Object)null);
        ((ArrayList) term34717).add((Object)null);
        ((ArrayList) term34717).add((Object)null);
        ((ArrayList) term34717).add((Object)null);
        ((ArrayList) term34717).add((Object)null);
        term34665 = newInstance(Class.forName("org.jsoup.nodes.Document"));
        setField(term34665, term34665.getClass(), "childNodes", term34717);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Document");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "body", argTypes, term34665, args);
            assertTrue(false);
        }
        catch (ClassCastException e) {
        }

    }

};


