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
import java.lang.NullPointerException;
import static org.jsoup.nodes.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.ArrayList;

public class Document_normaliseStructure_72252192089 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term40811;

    public Document_normaliseStructure_72252192089() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term41001 = newInstance(Class.forName("org.jsoup.nodes.DataNode"));
        ArrayList term40947 = new ArrayList();
        ((ArrayList) term40947).add(term41001);
        ((ArrayList) term40947).add((Object)null);
        ((ArrayList) term40947).add((Object)null);
        ((ArrayList) term40947).add((Object)null);
        ((ArrayList) term40947).add((Object)null);
        ((ArrayList) term40947).add((Object)null);
        ((ArrayList) term40947).add((Object)null);
        ((ArrayList) term40947).add((Object)null);
        ((ArrayList) term40947).add((Object)null);
        ((ArrayList) term40947).add((Object)null);
        ((ArrayList) term40947).add((Object)null);
        ((ArrayList) term40947).add((Object)null);
        ((ArrayList) term40947).add((Object)null);
        ((ArrayList) term40947).add((Object)null);
        ((ArrayList) term40947).add((Object)null);
        ((ArrayList) term40947).add((Object)null);
        ((ArrayList) term40947).add((Object)null);
        ((ArrayList) term40947).add((Object)null);
        ((ArrayList) term40947).add((Object)null);
        ((ArrayList) term40947).add((Object)null);
        ((ArrayList) term40947).add((Object)null);
        ((ArrayList) term40947).add((Object)null);
        ((ArrayList) term40947).add((Object)null);
        ((ArrayList) term40947).add((Object)null);
        ((ArrayList) term40947).add((Object)null);
        ((ArrayList) term40947).add((Object)null);
        ((ArrayList) term40947).add((Object)null);
        ((ArrayList) term40947).add((Object)null);
        ((ArrayList) term40947).add((Object)null);
        ((ArrayList) term40947).add((Object)null);
        ((ArrayList) term40947).add((Object)null);
        ((ArrayList) term40947).add((Object)null);
        ((ArrayList) term40947).add((Object)null);
        ((ArrayList) term40947).add((Object)null);
        ((ArrayList) term40947).add((Object)null);
        ((ArrayList) term40947).add((Object)null);
        ((ArrayList) term40947).add((Object)null);
        ((ArrayList) term40947).add((Object)null);
        ((ArrayList) term40947).add((Object)null);
        ((ArrayList) term40947).add((Object)null);
        ((ArrayList) term40947).add((Object)null);
        ((ArrayList) term40947).add((Object)null);
        ((ArrayList) term40947).add((Object)null);
        ((ArrayList) term40947).add((Object)null);
        ((ArrayList) term40947).add((Object)null);
        ((ArrayList) term40947).add((Object)null);
        ((ArrayList) term40947).add((Object)null);
        ((ArrayList) term40947).add((Object)null);
        ((ArrayList) term40947).add((Object)null);
        ((ArrayList) term40947).add((Object)null);
        ((ArrayList) term40947).add((Object)null);
        ((ArrayList) term40947).add((Object)null);
        ((ArrayList) term40947).add((Object)null);
        ((ArrayList) term40947).add((Object)null);
        ((ArrayList) term40947).add((Object)null);
        ((ArrayList) term40947).add((Object)null);
        ((ArrayList) term40947).add((Object)null);
        ((ArrayList) term40947).add((Object)null);
        ((ArrayList) term40947).add((Object)null);
        ((ArrayList) term40947).add((Object)null);
        ((ArrayList) term40947).add((Object)null);
        ((ArrayList) term40947).add((Object)null);
        ((ArrayList) term40947).add((Object)null);
        ((ArrayList) term40947).add((Object)null);
        ((ArrayList) term40947).add((Object)null);
        ((ArrayList) term40947).add((Object)null);
        ((ArrayList) term40947).add((Object)null);
        ((ArrayList) term40947).add((Object)null);
        ((ArrayList) term40947).add((Object)null);
        ((ArrayList) term40947).add((Object)null);
        ((ArrayList) term40947).add((Object)null);
        ((ArrayList) term40947).add((Object)null);
        ((ArrayList) term40947).add((Object)null);
        ((ArrayList) term40947).add((Object)null);
        ((ArrayList) term40947).add((Object)null);
        ((ArrayList) term40947).add((Object)null);
        ((ArrayList) term40947).add((Object)null);
        ((ArrayList) term40947).add((Object)null);
        ((ArrayList) term40947).add((Object)null);
        ((ArrayList) term40947).add((Object)null);
        term40811 = newInstance(Class.forName("org.jsoup.nodes.Document"));
        Object term40857 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term40857, term40857.getClass(), "tagName", "");
        setField(term40811, term40811.getClass(), "tag", term40857);
        setField(term40811, term40811.getClass(), "childNodes", term40947);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Document");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("org.jsoup.nodes.Element");
        Object[] args = new Object[2];
        args[0] = "                                                                                                          ";
        args[1] = null;
        try {
            callMethod(klass, "normaliseStructure", argTypes, term40811, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


