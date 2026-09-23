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
import java.util.ArrayList;
import java.lang.Object;

public class Document_normalise_41742654193 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term44838;

    public Document_normalise_41742654193() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term45004 = new ArrayList();
        Object term44952 = newInstance(Class.forName("org.jsoup.nodes.DocumentType"));
        setField(term44952, term44952.getClass(), "childNodes", term45004);
        ArrayList term44890 = new ArrayList();
        ((ArrayList) term44890).add(term44952);
        ((ArrayList) term44890).add((Object)null);
        ((ArrayList) term44890).add((Object)null);
        ((ArrayList) term44890).add((Object)null);
        ((ArrayList) term44890).add((Object)null);
        ((ArrayList) term44890).add((Object)null);
        ((ArrayList) term44890).add((Object)null);
        ((ArrayList) term44890).add((Object)null);
        ((ArrayList) term44890).add((Object)null);
        ((ArrayList) term44890).add((Object)null);
        term44838 = newInstance(Class.forName("org.jsoup.nodes.Document"));
        setField(term44838, term44838.getClass(), "childNodes", term44890);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Document");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "normalise", argTypes, term44838, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


