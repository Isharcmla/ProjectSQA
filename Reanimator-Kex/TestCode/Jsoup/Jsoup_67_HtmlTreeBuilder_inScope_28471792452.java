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
import java.lang.NullPointerException;
import static org.jsoup.parser.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.ArrayList;

public class HtmlTreeBuilder_inScope_28471792452 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term296885;

    public HtmlTreeBuilder_inScope_28471792452() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term297035 = newInstance(Class.forName("org.jsoup.nodes.FormElement"));
        Object term297081 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term297035, term297035.getClass(), "tag", term297081);
        ArrayList term296975 = new ArrayList();
        ((ArrayList) term296975).add((Object)null);
        ((ArrayList) term296975).add(term297035);
        ((ArrayList) term296975).add(term297035);
        ((ArrayList) term296975).add(term297035);
        ((ArrayList) term296975).add(term297035);
        ((ArrayList) term296975).add(term297035);
        ((ArrayList) term296975).add(term297035);
        ((ArrayList) term296975).add(term297035);
        ((ArrayList) term296975).add(term297035);
        ((ArrayList) term296975).add(term297035);
        ((ArrayList) term296975).add(term297035);
        ((ArrayList) term296975).add(term297035);
        ((ArrayList) term296975).add(term297035);
        ((ArrayList) term296975).add(term297035);
        ((ArrayList) term296975).add(term297035);
        ((ArrayList) term296975).add(term297035);
        ((ArrayList) term296975).add(term297035);
        ((ArrayList) term296975).add(term297035);
        ((ArrayList) term296975).add(term297035);
        ((ArrayList) term296975).add(term297035);
        ((ArrayList) term296975).add(term297035);
        ((ArrayList) term296975).add(term297035);
        ((ArrayList) term296975).add(term297035);
        ((ArrayList) term296975).add(term297035);
        ((ArrayList) term296975).add(term297035);
        ((ArrayList) term296975).add(term297035);
        ((ArrayList) term296975).add(term297035);
        ((ArrayList) term296975).add(term297035);
        ((ArrayList) term296975).add(term297035);
        ((ArrayList) term296975).add(term297035);
        ((ArrayList) term296975).add(term297035);
        ((ArrayList) term296975).add(term297035);
        ((ArrayList) term296975).add(term297035);
        ((ArrayList) term296975).add(term297035);
        ((ArrayList) term296975).add(term297035);
        ((ArrayList) term296975).add(term297035);
        ((ArrayList) term296975).add(term297035);
        ((ArrayList) term296975).add(term297035);
        ((ArrayList) term296975).add(term297035);
        ((ArrayList) term296975).add(term297035);
        ((ArrayList) term296975).add(term297035);
        ((ArrayList) term296975).add(term297035);
        ((ArrayList) term296975).add(term297035);
        ((ArrayList) term296975).add(term297035);
        ((ArrayList) term296975).add(term297035);
        ((ArrayList) term296975).add(term297035);
        ((ArrayList) term296975).add(term297035);
        ((ArrayList) term296975).add(term297035);
        ((ArrayList) term296975).add(term297035);
        ((ArrayList) term296975).add(term297035);
        ((ArrayList) term296975).add(term297035);
        ((ArrayList) term296975).add(term297035);
        ((ArrayList) term296975).add(term297035);
        ((ArrayList) term296975).add(term297035);
        ((ArrayList) term296975).add(term297035);
        ((ArrayList) term296975).add(term297035);
        ((ArrayList) term296975).add(term297035);
        ((ArrayList) term296975).add(term297035);
        ((ArrayList) term296975).add(term297035);
        ((ArrayList) term296975).add(term297035);
        ((ArrayList) term296975).add(term297035);
        ((ArrayList) term296975).add(term297035);
        ((ArrayList) term296975).add(term297035);
        ((ArrayList) term296975).add(term297035);
        term296885 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        Object[] term296774 = (Object[]) newArray("java.lang.String", 1);
        setElement(term296774, 0, "");
        setField(term296885, term296885.getClass(), "specificScopeTarget", term296774);
        setField(term296885, term296885.getClass(), "stack", term296975);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "";
        try {
            callMethod(klass, "inScope", argTypes, term296885, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


