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
import java.lang.Object;
import java.util.ArrayList;
import java.util.LinkedHashMap;

public class Element_getAllElements_545850969 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5702;

    public Element_getAllElements_545850969() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term5724 = new ArrayList();
        ((ArrayList) term5724).add((Object)null);
        ((ArrayList) term5724).add((Object)null);
        ((ArrayList) term5724).add((Object)null);
        LinkedHashMap term5729 = new LinkedHashMap();
        term5702 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term5703 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term5728 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term5703, term5703.getClass(), "tagName", "cSHGbqKqlN");
        setBooleanField(term5703, term5703.getClass(), "isBlock", false);
        setBooleanField(term5703, term5703.getClass(), "formatAsBlock", false);
        setBooleanField(term5703, term5703.getClass(), "canContainInline", true);
        setBooleanField(term5703, term5703.getClass(), "empty", false);
        setBooleanField(term5703, term5703.getClass(), "selfClosing", false);
        setBooleanField(term5703, term5703.getClass(), "preserveWhitespace", true);
        setBooleanField(term5703, term5703.getClass(), "formList", true);
        setBooleanField(term5703, term5703.getClass(), "formSubmit", false);
        setField(term5702, term5702.getClass(), "tag", term5703);
        setField(term5702, term5702.getClass(), "parentNode", null);
        setField(term5702, term5702.getClass(), "childNodes", term5724);
        setField(term5728, term5728.getClass(), "attributes", term5729);
        setField(term5702, term5702.getClass(), "attributes", term5728);
        setField(term5702, term5702.getClass(), "baseUri", "HpZXWDPhlg");
        setIntField(term5702, term5702.getClass(), "siblingIndex", 11724947);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getAllElements", argTypes, term5702, args);
    }

};


