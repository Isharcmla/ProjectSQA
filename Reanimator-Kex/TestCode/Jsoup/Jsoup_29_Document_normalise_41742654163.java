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

public class Document_normalise_41742654163 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term27594;

    public Document_normalise_41742654163() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term27708 = newInstance(Class.forName("org.jsoup.nodes.DocumentType"));
        ArrayList term27646 = new ArrayList();
        ((ArrayList) term27646).add(term27708);
        term27594 = newInstance(Class.forName("org.jsoup.nodes.Document"));
        setField(term27594, term27594.getClass(), "childNodes", term27646);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Document");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "normalise", argTypes, term27594, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


