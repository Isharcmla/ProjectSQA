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
import java.lang.IllegalArgumentException;
import static org.jsoup.parser.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.StringBuilder;

public class XmlTreeBuilder_insert_50434454381 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term94729;
     Object term94795;

    public XmlTreeBuilder_insert_50434454381() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term94729 = newInstance(Class.forName("org.jsoup.parser.XmlTreeBuilder"));
        setField(term94729, term94729.getClass(), "baseUri", null);
        char[] term94292 = (char[]) newCharArray(0);
        StringBuilder term94855 = new StringBuilder();
        ((StringBuilder) term94855).append(term94292);
        char[] term94296 = (char[]) newCharArray(105);
        StringBuilder term94915 = new StringBuilder();
        ((StringBuilder) term94915).append(term94296);
        StringBuilder term94975 = new StringBuilder();
        term94795 = newInstance(Class.forName("org.jsoup.parser.Token$Doctype"));
        setField(term94795, term94795.getClass(), "name", term94855);
        setField(term94795, term94795.getClass(), "publicIdentifier", term94915);
        setField(term94795, term94795.getClass(), "systemIdentifier", term94975);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.XmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token$Doctype");
        Object[] args = new Object[1];
        args[0] = term94795;
        try {
            callMethod(klass, "insert", argTypes, term94729, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


