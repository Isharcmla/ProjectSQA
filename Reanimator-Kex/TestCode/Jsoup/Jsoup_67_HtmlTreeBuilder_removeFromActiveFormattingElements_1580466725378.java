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

public class HtmlTreeBuilder_removeFromActiveFormattingElements_1580466725378 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term260088;
     Object term260192;

    public HtmlTreeBuilder_removeFromActiveFormattingElements_1580466725378() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object[] term259991 = (Object[]) newArray("java.lang.Object", 64);
        setElement(term259991, 0, term259991);
        setElement(term259991, 1, term259991);
        setElement(term259991, 2, term259991);
        setElement(term259991, 3, term259991);
        setElement(term259991, 4, term259991);
        setElement(term259991, 5, term259991);
        setElement(term259991, 6, term259991);
        setElement(term259991, 7, term259991);
        setElement(term259991, 8, term259991);
        setElement(term259991, 9, term259991);
        setElement(term259991, 10, term259991);
        setElement(term259991, 11, term259991);
        setElement(term259991, 12, term259991);
        setElement(term259991, 13, term259991);
        setElement(term259991, 14, term259991);
        setElement(term259991, 15, term259991);
        setElement(term259991, 16, term259991);
        setElement(term259991, 17, term259991);
        setElement(term259991, 18, term259991);
        setElement(term259991, 19, term259991);
        setElement(term259991, 20, term259991);
        setElement(term259991, 21, term259991);
        setElement(term259991, 22, term259991);
        setElement(term259991, 23, term259991);
        setElement(term259991, 24, term259991);
        setElement(term259991, 25, term259991);
        setElement(term259991, 26, term259991);
        setElement(term259991, 27, term259991);
        setElement(term259991, 28, term259991);
        setElement(term259991, 29, term259991);
        setElement(term259991, 30, term259991);
        setElement(term259991, 31, term259991);
        setElement(term259991, 32, term259991);
        setElement(term259991, 33, term259991);
        setElement(term259991, 34, term259991);
        setElement(term259991, 35, term259991);
        setElement(term259991, 36, term259991);
        setElement(term259991, 37, term259991);
        setElement(term259991, 38, term259991);
        setElement(term259991, 39, term259991);
        setElement(term259991, 40, term259991);
        setElement(term259991, 41, term259991);
        setElement(term259991, 42, term259991);
        setElement(term259991, 43, term259991);
        setElement(term259991, 44, term259991);
        setElement(term259991, 45, term259991);
        setElement(term259991, 46, term259991);
        setElement(term259991, 47, term259991);
        setElement(term259991, 48, term259991);
        setElement(term259991, 49, term259991);
        setElement(term259991, 50, term259991);
        setElement(term259991, 51, term259991);
        setElement(term259991, 52, term259991);
        setElement(term259991, 53, term259991);
        setElement(term259991, 54, term259991);
        setElement(term259991, 55, term259991);
        setElement(term259991, 56, term259991);
        setElement(term259991, 57, term259991);
        setElement(term259991, 58, term259991);
        setElement(term259991, 59, term259991);
        setElement(term259991, 60, term259991);
        setElement(term259991, 61, term259991);
        setElement(term259991, 62, term259991);
        ArrayList term260140 = new ArrayList();
        ((ArrayList) term260140).add((Object)term259991);
        ((ArrayList) term260140).add((Object)term259991);
        ((ArrayList) term260140).add((Object)term259991);
        ((ArrayList) term260140).add((Object)term259991);
        ((ArrayList) term260140).add((Object)term259991);
        ((ArrayList) term260140).add((Object)term259991);
        ((ArrayList) term260140).add((Object)term259991);
        ((ArrayList) term260140).add((Object)term259991);
        ((ArrayList) term260140).add((Object)term259991);
        ((ArrayList) term260140).add((Object)term259991);
        ((ArrayList) term260140).add((Object)term259991);
        ((ArrayList) term260140).add((Object)term259991);
        ((ArrayList) term260140).add((Object)term259991);
        ((ArrayList) term260140).add((Object)term259991);
        ((ArrayList) term260140).add((Object)term259991);
        ((ArrayList) term260140).add((Object)term259991);
        ((ArrayList) term260140).add((Object)term259991);
        ((ArrayList) term260140).add((Object)term259991);
        ((ArrayList) term260140).add((Object)term259991);
        ((ArrayList) term260140).add((Object)term259991);
        ((ArrayList) term260140).add((Object)term259991);
        ((ArrayList) term260140).add((Object)term259991);
        ((ArrayList) term260140).add((Object)term259991);
        ((ArrayList) term260140).add((Object)term259991);
        ((ArrayList) term260140).add((Object)term259991);
        ((ArrayList) term260140).add((Object)term259991);
        ((ArrayList) term260140).add((Object)term259991);
        ((ArrayList) term260140).add((Object)term259991);
        ((ArrayList) term260140).add((Object)term259991);
        ((ArrayList) term260140).add((Object)term259991);
        ((ArrayList) term260140).add((Object)term259991);
        ((ArrayList) term260140).add((Object)term259991);
        ((ArrayList) term260140).add((Object)term259991);
        ((ArrayList) term260140).add((Object)term259991);
        ((ArrayList) term260140).add((Object)term259991);
        ((ArrayList) term260140).add((Object)term259991);
        ((ArrayList) term260140).add((Object)term259991);
        ((ArrayList) term260140).add((Object)term259991);
        ((ArrayList) term260140).add((Object)term259991);
        ((ArrayList) term260140).add((Object)term259991);
        ((ArrayList) term260140).add((Object)term259991);
        ((ArrayList) term260140).add((Object)term259991);
        ((ArrayList) term260140).add((Object)term259991);
        ((ArrayList) term260140).add((Object)term259991);
        ((ArrayList) term260140).add((Object)term259991);
        ((ArrayList) term260140).add((Object)term259991);
        ((ArrayList) term260140).add((Object)term259991);
        ((ArrayList) term260140).add((Object)term259991);
        ((ArrayList) term260140).add((Object)term259991);
        ((ArrayList) term260140).add((Object)term259991);
        ((ArrayList) term260140).add((Object)term259991);
        ((ArrayList) term260140).add((Object)term259991);
        ((ArrayList) term260140).add((Object)term259991);
        ((ArrayList) term260140).add((Object)term259991);
        ((ArrayList) term260140).add((Object)term259991);
        ((ArrayList) term260140).add((Object)term259991);
        ((ArrayList) term260140).add((Object)term259991);
        ((ArrayList) term260140).add((Object)term259991);
        ((ArrayList) term260140).add((Object)term259991);
        ((ArrayList) term260140).add((Object)term259991);
        ((ArrayList) term260140).add((Object)term259991);
        ((ArrayList) term260140).add((Object)term259991);
        ((ArrayList) term260140).add((Object)term259991);
        ((ArrayList) term260140).add((Object)null);
        term260088 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term260088, term260088.getClass(), "formattingElements", term260140);
        term260192 = newInstance(Class.forName("org.jsoup.nodes.Element"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.nodes.Element");
        Object[] args = new Object[1];
        args[0] = term260192;
        try {
            callMethod(klass, "removeFromActiveFormattingElements", argTypes, term260088, args);
            assertTrue(false);
        }
        catch (ClassCastException e) {
        }

    }

};


