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
import java.lang.Object;
import java.util.ArrayList;

public class Document_title_195224324271 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term47386;
     Object term47863;

    public Document_title_195224324271() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term47522 = new ArrayList();
        term47386 = newInstance(Class.forName("org.jsoup.nodes.Document"));
        Object term47432 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term47432, term47432.getClass(), "tagName", "         ");
        setField(term47386, term47386.getClass(), "tag", term47432);
        setField(term47386, term47386.getClass(), "childNodes", term47522);
        ArrayList term47867 = new ArrayList();
        term47863 = newInstance(Class.forName("org.jsoup.nodes.Document"));
        Object term47864 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term47864, term47864.getClass(), "tagName", "         ");
        setBooleanField(term47864, term47864.getClass(), "isBlock", false);
        setBooleanField(term47864, term47864.getClass(), "canContainBlock", false);
        setBooleanField(term47864, term47864.getClass(), "canContainInline", false);
        setBooleanField(term47864, term47864.getClass(), "optionalClosing", false);
        setBooleanField(term47864, term47864.getClass(), "empty", false);
        setBooleanField(term47864, term47864.getClass(), "preserveWhitespace", false);
        setField(term47864, term47864.getClass(), "ancestors", null);
        setField(term47863, term47863.getClass(), "tag", term47864);
        setField(term47863, term47863.getClass(), "classNames", null);
        setField(term47863, term47863.getClass(), "parentNode", null);
        setField(term47863, term47863.getClass(), "childNodes", term47867);
        setField(term47863, term47863.getClass(), "attributes", null);
        setField(term47863, term47863.getClass(), "baseUri", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Document");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "title", argTypes, term47386, args);
        assertTrue(recursiveEquals(term47386, term47863));
        assertTrue(recursiveEquals(retValue, ""));
    }

};
