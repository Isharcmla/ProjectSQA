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
import static org.jsoup.nodes.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;

public class Element_outerHtmlHead_1152301544243 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term94333;
     Object term94335;

    public Element_outerHtmlHead_1152301544243() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term94333 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        setField(term94333, term94333.getClass(), "tag", null);
        setField(term94333, term94333.getClass(), "parentNode", null);
        setField(term94333, term94333.getClass(), "childNodes", null);
        setField(term94333, term94333.getClass(), "attributes", null);
        setField(term94333, term94333.getClass(), "baseUri", null);
        setIntField(term94333, term94333.getClass(), "siblingIndex", 0);
        term94335 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.Appendable");
        argTypes[1] = int.class;
        argTypes[2] = Class.forName("org.jsoup.nodes.Document$OutputSettings");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = term94335;
        args[2] = null;
        callMethod(klass, "outerHtmlHead", argTypes, term94333, args);
    }

};


