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
import static org.jsoup.nodes.EqualityUtils.*;
import java.util.ArrayList;

public class Document_outerHtml_835993368106 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term70200;
     Object term70854;

    public Document_outerHtml_835993368106() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term70252 = new ArrayList();
        term70200 = newInstance(Class.forName("org.jsoup.nodes.Document"));
        setField(term70200, term70200.getClass(), "childNodes", term70252);
        ArrayList term70855 = new ArrayList();
        term70854 = newInstance(Class.forName("org.jsoup.nodes.Document"));
        setField(term70854, term70854.getClass(), "outputSettings", null);
        setField(term70854, term70854.getClass(), "quirksMode", null);
        setField(term70854, term70854.getClass(), "tag", null);
        setField(term70854, term70854.getClass(), "classNames", null);
        setField(term70854, term70854.getClass(), "parentNode", null);
        setField(term70854, term70854.getClass(), "childNodes", term70855);
        setField(term70854, term70854.getClass(), "attributes", null);
        setField(term70854, term70854.getClass(), "baseUri", null);
        setIntField(term70854, term70854.getClass(), "siblingIndex", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Document");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "outerHtml", argTypes, term70200, args);
        assertTrue(recursiveEquals(term70200, term70854));
        assertTrue(recursiveEquals(retValue, ""));
    }

};


