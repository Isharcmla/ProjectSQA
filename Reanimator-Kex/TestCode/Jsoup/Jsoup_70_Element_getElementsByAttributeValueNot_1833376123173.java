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
import java.lang.ArrayIndexOutOfBoundsException;
import static org.jsoup.nodes.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.ArrayList;

public class Element_getElementsByAttributeValueNot_1833376123173 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4563;

    public Element_getElementsByAttributeValueNot_1833376123173() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term4589 = new ArrayList();
        ((ArrayList) term4589).add((Object)null);
        ((ArrayList) term4589).add((Object)null);
        ((ArrayList) term4589).add((Object)null);
        ((ArrayList) term4589).add((Object)null);
        term4563 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term4564 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term4585 = newInstance(Class.forName("java.lang.ref.WeakReference"));
        Object term4586 = newInstance(Class.forName("java.lang.ref.ReferenceQueue"));
        Object term4587 = newInstance(Class.forName("java.lang.ref.ReferenceQueue$Lock"));
        Object term4593 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term4595 = (Object[]) newArray("java.lang.String", 0);
        Object[] term4596 = (Object[]) newArray("java.lang.String", 0);
        setField(term4564, term4564.getClass(), "tagName", "HzqpegHiRq");
        setBooleanField(term4564, term4564.getClass(), "isBlock", false);
        setBooleanField(term4564, term4564.getClass(), "formatAsBlock", true);
        setBooleanField(term4564, term4564.getClass(), "canContainInline", true);
        setBooleanField(term4564, term4564.getClass(), "empty", false);
        setBooleanField(term4564, term4564.getClass(), "selfClosing", false);
        setBooleanField(term4564, term4564.getClass(), "preserveWhitespace", true);
        setBooleanField(term4564, term4564.getClass(), "formList", false);
        setBooleanField(term4564, term4564.getClass(), "formSubmit", true);
        setField(term4563, term4563.getClass(), "tag", term4564);
        setField(term4585, term4585.getClass(), "referent", null);
        setField(term4586, term4586.getClass(), "lock", term4587);
        setField(term4586, term4586.getClass(), "head", null);
        setLongField(term4586, term4586.getClass(), "queueLength", 5953383087795962419L);
        setField(term4585, term4585.getClass(), "queue", term4586);
        setField(term4585, term4585.getClass(), "next", null);
        setField(term4585, term4585.getClass(), "discovered", null);
        setField(term4563, term4563.getClass(), "shadowChildrenRef", term4585);
        setField(term4563, term4563.getClass(), "childNodes", term4589);
        setIntField(term4593, term4593.getClass(), "size", 568954359);
        setField(term4593, term4593.getClass(), "keys", term4595);
        setField(term4593, term4593.getClass(), "vals", term4596);
        setField(term4563, term4563.getClass(), "attributes", term4593);
        setField(term4563, term4563.getClass(), "baseUri", "jwsfVjMoJT");
        setField(term4563, term4563.getClass(), "parentNode", null);
        setIntField(term4563, term4563.getClass(), "siblingIndex", 53410913);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = "ZfdXfCCFDf";
        args[1] = "MwwjNtdOFT";
        try {
            callMethod(klass, "getElementsByAttributeValueNot", argTypes, term4563, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


