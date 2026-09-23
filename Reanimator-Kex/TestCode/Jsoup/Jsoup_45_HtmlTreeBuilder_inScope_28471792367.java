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
import static org.jsoup.parser.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.ArrayList;

public class HtmlTreeBuilder_inScope_28471792367 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term729501;

    public HtmlTreeBuilder_inScope_28471792367() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term729591 = new ArrayList();
        ((ArrayList) term729591).add((Object)null);
        ((ArrayList) term729591).add("table");
        ((ArrayList) term729591).add("table");
        ((ArrayList) term729591).add("table");
        ((ArrayList) term729591).add("table");
        ((ArrayList) term729591).add("table");
        ((ArrayList) term729591).add("table");
        ((ArrayList) term729591).add("table");
        ((ArrayList) term729591).add("table");
        ((ArrayList) term729591).add("table");
        ((ArrayList) term729591).add("table");
        ((ArrayList) term729591).add("table");
        ((ArrayList) term729591).add("table");
        ((ArrayList) term729591).add("table");
        ((ArrayList) term729591).add("table");
        ((ArrayList) term729591).add("table");
        ((ArrayList) term729591).add((Object)null);
        ((ArrayList) term729591).add("table");
        ((ArrayList) term729591).add("table");
        ((ArrayList) term729591).add("table");
        ((ArrayList) term729591).add("table");
        ((ArrayList) term729591).add("table");
        ((ArrayList) term729591).add("table");
        ((ArrayList) term729591).add("table");
        ((ArrayList) term729591).add("table");
        ((ArrayList) term729591).add("table");
        ((ArrayList) term729591).add("table");
        ((ArrayList) term729591).add("table");
        ((ArrayList) term729591).add("table");
        ((ArrayList) term729591).add("table");
        ((ArrayList) term729591).add("table");
        ((ArrayList) term729591).add("table");
        ((ArrayList) term729591).add("table");
        ((ArrayList) term729591).add("table");
        ((ArrayList) term729591).add("table");
        ((ArrayList) term729591).add("table");
        ((ArrayList) term729591).add("table");
        ((ArrayList) term729591).add("table");
        ((ArrayList) term729591).add("table");
        ((ArrayList) term729591).add("table");
        ((ArrayList) term729591).add("table");
        ((ArrayList) term729591).add("table");
        ((ArrayList) term729591).add("table");
        ((ArrayList) term729591).add("table");
        ((ArrayList) term729591).add("table");
        ((ArrayList) term729591).add("table");
        ((ArrayList) term729591).add("table");
        ((ArrayList) term729591).add("table");
        ((ArrayList) term729591).add("table");
        ((ArrayList) term729591).add("table");
        ((ArrayList) term729591).add("table");
        ((ArrayList) term729591).add("table");
        ((ArrayList) term729591).add("table");
        ((ArrayList) term729591).add("table");
        ((ArrayList) term729591).add("table");
        ((ArrayList) term729591).add("table");
        ((ArrayList) term729591).add("table");
        ((ArrayList) term729591).add("table");
        ((ArrayList) term729591).add("table");
        ((ArrayList) term729591).add("table");
        ((ArrayList) term729591).add("table");
        ((ArrayList) term729591).add("table");
        ((ArrayList) term729591).add("table");
        ((ArrayList) term729591).add("marquee");
        term729501 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        Object[] term729307 = (Object[]) newArray("java.lang.String", 1);
        setElement(term729307, 0, "");
        setField(term729501, term729501.getClass(), "specificScopeTarget", term729307);
        setField(term729501, term729501.getClass(), "stack", term729591);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "inScope", argTypes, term729501, args);
    }

};


