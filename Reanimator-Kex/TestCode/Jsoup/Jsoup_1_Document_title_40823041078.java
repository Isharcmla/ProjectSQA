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

public class Document_title_40823041078 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term51067;

    public Document_title_40823041078() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term51313 = newInstance(Class.forName("org.vorpal.research.kex.intrinsics.UnknownIntrinsics"));
        ArrayList term51203 = new ArrayList();
        ((ArrayList) term51203).add((Object)null);
        ((ArrayList) term51203).add((Object)null);
        ((ArrayList) term51203).add(term51313);
        ((ArrayList) term51203).add((Object)null);
        ((ArrayList) term51203).add((Object)null);
        term51067 = newInstance(Class.forName("org.jsoup.nodes.Document"));
        Object term51113 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term51113, term51113.getClass(), "tagName", "         ");
        setField(term51067, term51067.getClass(), "tag", term51113);
        setField(term51067, term51067.getClass(), "childNodes", term51203);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Document");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "";
        try {
            callMethod(klass, "title", argTypes, term51067, args);
            assertTrue(false);
        }
        catch (ClassCastException e) {
        }

    }

};
