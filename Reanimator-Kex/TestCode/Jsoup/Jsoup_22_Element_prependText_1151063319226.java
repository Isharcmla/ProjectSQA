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
import java.util.ArrayList;
import java.lang.Object;

public class Element_prependText_1151063319226 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term54187;

    public Element_prependText_1151063319226() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term54331 = newInstance(Class.forName("org.jsoup.nodes.TextNode"));
        ArrayList term54277 = new ArrayList();
        ((ArrayList) term54277).add(term54331);
        ((ArrayList) term54277).add(term54331);
        ((ArrayList) term54277).add(term54331);
        ((ArrayList) term54277).add(term54331);
        ((ArrayList) term54277).add(term54331);
        ((ArrayList) term54277).add(term54331);
        ((ArrayList) term54277).add(term54331);
        ((ArrayList) term54277).add(term54331);
        ((ArrayList) term54277).add(term54331);
        ((ArrayList) term54277).add(term54331);
        ((ArrayList) term54277).add(term54331);
        ((ArrayList) term54277).add(term54331);
        ((ArrayList) term54277).add(term54331);
        ((ArrayList) term54277).add(term54331);
        ((ArrayList) term54277).add(term54331);
        ((ArrayList) term54277).add((Object)null);
        ((ArrayList) term54277).add(term54331);
        ((ArrayList) term54277).add(term54331);
        ((ArrayList) term54277).add(term54331);
        ((ArrayList) term54277).add(term54331);
        ((ArrayList) term54277).add(term54331);
        ((ArrayList) term54277).add(term54331);
        ((ArrayList) term54277).add(term54331);
        ((ArrayList) term54277).add(term54331);
        ((ArrayList) term54277).add(term54331);
        ((ArrayList) term54277).add(term54331);
        term54187 = newInstance(Class.forName("org.jsoup.nodes.Document"));
        setField(term54187, term54187.getClass(), "baseUri", "");
        setField(term54187, term54187.getClass(), "childNodes", term54277);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "prependText", argTypes, term54187, args);
    }

};


