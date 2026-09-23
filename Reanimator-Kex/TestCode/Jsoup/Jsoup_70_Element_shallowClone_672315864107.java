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

public class Element_shallowClone_672315864107 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term55570;

    public Element_shallowClone_672315864107() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term55596 = new ArrayList();
        term55570 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term55571 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term55592 = newInstance(Class.forName("java.lang.ref.WeakReference"));
        Object term55593 = newInstance(Class.forName("java.lang.ref.ReferenceQueue"));
        Object term55594 = newInstance(Class.forName("java.lang.ref.ReferenceQueue$Lock"));
        Object term55600 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term55602 = (Object[]) newArray("java.lang.String", 0);
        Object[] term55603 = (Object[]) newArray("java.lang.String", 0);
        setField(term55571, term55571.getClass(), "tagName", "ZKMLioamsY");
        setBooleanField(term55571, term55571.getClass(), "isBlock", true);
        setBooleanField(term55571, term55571.getClass(), "formatAsBlock", false);
        setBooleanField(term55571, term55571.getClass(), "canContainInline", false);
        setBooleanField(term55571, term55571.getClass(), "empty", false);
        setBooleanField(term55571, term55571.getClass(), "selfClosing", false);
        setBooleanField(term55571, term55571.getClass(), "preserveWhitespace", false);
        setBooleanField(term55571, term55571.getClass(), "formList", true);
        setBooleanField(term55571, term55571.getClass(), "formSubmit", true);
        setField(term55570, term55570.getClass(), "tag", term55571);
        setField(term55592, term55592.getClass(), "referent", null);
        setField(term55593, term55593.getClass(), "lock", term55594);
        setField(term55593, term55593.getClass(), "head", null);
        setLongField(term55593, term55593.getClass(), "queueLength", -5216789073301458893L);
        setField(term55592, term55592.getClass(), "queue", term55593);
        setField(term55592, term55592.getClass(), "next", null);
        setField(term55592, term55592.getClass(), "discovered", null);
        setField(term55570, term55570.getClass(), "shadowChildrenRef", term55592);
        setField(term55570, term55570.getClass(), "childNodes", term55596);
        setIntField(term55600, term55600.getClass(), "size", 2009020256);
        setField(term55600, term55600.getClass(), "keys", term55602);
        setField(term55600, term55600.getClass(), "vals", term55603);
        setField(term55570, term55570.getClass(), "attributes", term55600);
        setField(term55570, term55570.getClass(), "baseUri", "WVbxuoDBcn");
        setField(term55570, term55570.getClass(), "parentNode", null);
        setIntField(term55570, term55570.getClass(), "siblingIndex", 2049577015);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "shallowClone", argTypes, term55570, args);
    }

};


