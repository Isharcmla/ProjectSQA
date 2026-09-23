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

public class Document_outerHtml_83599336827 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13551;

    public Document_outerHtml_83599336827() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term13551 = newInstance(Class.forName("org.jsoup.nodes.Document"));
        setField(term13551, term13551.getClass(), "outputSettings", null);
        setField(term13551, term13551.getClass(), "tag", null);
        setField(term13551, term13551.getClass(), "classNames", null);
        setField(term13551, term13551.getClass(), "parentNode", null);
        setField(term13551, term13551.getClass(), "childNodes", null);
        setField(term13551, term13551.getClass(), "attributes", null);
        setField(term13551, term13551.getClass(), "baseUri", null);
        setIntField(term13551, term13551.getClass(), "siblingIndex", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Document");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "outerHtml", argTypes, term13551, args);
    }

};


