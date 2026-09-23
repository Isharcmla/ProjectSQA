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

public class Document_normalise_41742654142 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20839;

    public Document_normalise_41742654142() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term20891 = new ArrayList();
        ((ArrayList) term20891).add("html");
        ((ArrayList) term20891).add((Object)null);
        ((ArrayList) term20891).add((Object)null);
        ((ArrayList) term20891).add((Object)null);
        ((ArrayList) term20891).add((Object)null);
        ((ArrayList) term20891).add((Object)null);
        ((ArrayList) term20891).add((Object)null);
        ((ArrayList) term20891).add((Object)null);
        ((ArrayList) term20891).add((Object)null);
        ((ArrayList) term20891).add((Object)null);
        term20839 = newInstance(Class.forName("org.jsoup.nodes.Document"));
        setField(term20839, term20839.getClass(), "childNodes", term20891);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Document");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "normalise", argTypes, term20839, args);
            assertTrue(false);
        }
        catch (ClassCastException e) {
        }

    }

};


