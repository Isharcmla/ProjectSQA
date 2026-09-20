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

public class Document_title_195224324254 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term32780;

    public Document_title_195224324254() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object[] term32592 = (Object[]) newArray("java.lang.Object", 5);
        setElement(term32592, 4, term32592);
        ArrayList term32916 = new ArrayList();
        ((ArrayList) term32916).add((Object)null);
        ((ArrayList) term32916).add((Object)null);
        ((ArrayList) term32916).add((Object)null);
        ((ArrayList) term32916).add((Object)null);
        ((ArrayList) term32916).add((Object)term32592);
        term32780 = newInstance(Class.forName("org.jsoup.nodes.Document"));
        Object term32826 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term32826, term32826.getClass(), "tagName", "         ");
        setField(term32780, term32780.getClass(), "tag", term32826);
        setField(term32780, term32780.getClass(), "childNodes", term32916);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Document");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "title", argTypes, term32780, args);
            assertTrue(false);
        }
        catch (ClassCastException e) {
        }

    }

};
