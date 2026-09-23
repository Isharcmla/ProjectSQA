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

public class HtmlTreeBuilder_inListItemScope_1621646591310 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term228754;

    public HtmlTreeBuilder_inListItemScope_1621646591310() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term228866 = newInstance(Class.forName("org.jsoup.nodes.FormElement"));
        Object term228912 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term228866, term228866.getClass(), "tag", term228912);
        ArrayList term228806 = new ArrayList();
        ((ArrayList) term228806).add(term228866);
        ((ArrayList) term228806).add(term228866);
        ((ArrayList) term228806).add(term228866);
        ((ArrayList) term228806).add(term228866);
        ((ArrayList) term228806).add(term228866);
        ((ArrayList) term228806).add(term228866);
        ((ArrayList) term228806).add(term228866);
        ((ArrayList) term228806).add(term228866);
        ((ArrayList) term228806).add(term228866);
        ((ArrayList) term228806).add(term228866);
        ((ArrayList) term228806).add(term228866);
        ((ArrayList) term228806).add(term228866);
        ((ArrayList) term228806).add(term228866);
        ((ArrayList) term228806).add(term228866);
        ((ArrayList) term228806).add(term228866);
        ((ArrayList) term228806).add(term228866);
        ((ArrayList) term228806).add(term228866);
        ((ArrayList) term228806).add(term228866);
        ((ArrayList) term228806).add(term228866);
        ((ArrayList) term228806).add(term228866);
        ((ArrayList) term228806).add(term228866);
        ((ArrayList) term228806).add(term228866);
        ((ArrayList) term228806).add(term228866);
        ((ArrayList) term228806).add(term228866);
        term228754 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        Object[] term228642 = (Object[]) newArray("java.lang.String", 41);
        setField(term228754, term228754.getClass(), "specificScopeTarget", term228642);
        setField(term228754, term228754.getClass(), "stack", term228806);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "inListItemScope", argTypes, term228754, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


