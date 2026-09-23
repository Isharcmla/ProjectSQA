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
import java.lang.Integer;

public class Element_getElementsByIndexLessThan_751556693179 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5307;
     Object term5354;
     Object term251474;
     Object term251470;

    public Element_getElementsByIndexLessThan_751556693179() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term5333 = new ArrayList();
        ((ArrayList) term5333).add((Object)null);
        ((ArrayList) term5333).add((Object)null);
        ((ArrayList) term5333).add((Object)null);
        term5307 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term5308 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term5329 = newInstance(Class.forName("java.lang.ref.WeakReference"));
        Object term5330 = newInstance(Class.forName("java.lang.ref.ReferenceQueue"));
        Object term5331 = newInstance(Class.forName("java.lang.ref.ReferenceQueue$Lock"));
        Object term5337 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term5339 = (Object[]) newArray("java.lang.String", 0);
        Object[] term5340 = (Object[]) newArray("java.lang.String", 0);
        setField(term5308, term5308.getClass(), "tagName", "cudZvLMQon");
        setBooleanField(term5308, term5308.getClass(), "isBlock", false);
        setBooleanField(term5308, term5308.getClass(), "formatAsBlock", true);
        setBooleanField(term5308, term5308.getClass(), "canContainInline", false);
        setBooleanField(term5308, term5308.getClass(), "empty", false);
        setBooleanField(term5308, term5308.getClass(), "selfClosing", false);
        setBooleanField(term5308, term5308.getClass(), "preserveWhitespace", false);
        setBooleanField(term5308, term5308.getClass(), "formList", true);
        setBooleanField(term5308, term5308.getClass(), "formSubmit", true);
        setField(term5307, term5307.getClass(), "tag", term5308);
        setField(term5329, term5329.getClass(), "referent", null);
        setField(term5330, term5330.getClass(), "lock", term5331);
        setField(term5330, term5330.getClass(), "head", null);
        setLongField(term5330, term5330.getClass(), "queueLength", 414749984815662075L);
        setField(term5329, term5329.getClass(), "queue", term5330);
        setField(term5329, term5329.getClass(), "next", null);
        setField(term5329, term5329.getClass(), "discovered", null);
        setField(term5307, term5307.getClass(), "shadowChildrenRef", term5329);
        setField(term5307, term5307.getClass(), "childNodes", term5333);
        setIntField(term5337, term5337.getClass(), "size", -1498296052);
        setField(term5337, term5337.getClass(), "keys", term5339);
        setField(term5337, term5337.getClass(), "vals", term5340);
        setField(term5307, term5307.getClass(), "attributes", term5337);
        setField(term5307, term5307.getClass(), "baseUri", "lihXWlGDxk");
        setField(term5307, term5307.getClass(), "parentNode", null);
        setIntField(term5307, term5307.getClass(), "siblingIndex", 2098647989);
        term5354 = new Integer(1598895173);
        ArrayList term251481 = new ArrayList();
        ((ArrayList) term251481).add((Object)null);
        ((ArrayList) term251481).add((Object)null);
        ((ArrayList) term251481).add((Object)null);
        term251474 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term251475 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term251478 = newInstance(Class.forName("java.lang.ref.WeakReference"));
        Object term251479 = newInstance(Class.forName("java.lang.ref.ReferenceQueue"));
        Object term251480 = newInstance(Class.forName("java.lang.ref.ReferenceQueue$Lock"));
        Object term251483 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term251484 = (Object[]) newArray("java.lang.String", 0);
        Object[] term251485 = (Object[]) newArray("java.lang.String", 0);
        setField(term251475, term251475.getClass(), "tagName", "cudZvLMQon");
        setBooleanField(term251475, term251475.getClass(), "isBlock", false);
        setBooleanField(term251475, term251475.getClass(), "formatAsBlock", true);
        setBooleanField(term251475, term251475.getClass(), "canContainInline", false);
        setBooleanField(term251475, term251475.getClass(), "empty", false);
        setBooleanField(term251475, term251475.getClass(), "selfClosing", false);
        setBooleanField(term251475, term251475.getClass(), "preserveWhitespace", false);
        setBooleanField(term251475, term251475.getClass(), "formList", true);
        setBooleanField(term251475, term251475.getClass(), "formSubmit", true);
        setField(term251474, term251474.getClass(), "tag", term251475);
        setField(term251478, term251478.getClass(), "referent", null);
        setField(term251479, term251479.getClass(), "lock", term251480);
        setField(term251479, term251479.getClass(), "head", null);
        setLongField(term251479, term251479.getClass(), "queueLength", 414749984815662075L);
        setField(term251478, term251478.getClass(), "queue", term251479);
        setField(term251478, term251478.getClass(), "next", null);
        setField(term251478, term251478.getClass(), "discovered", null);
        setField(term251474, term251474.getClass(), "shadowChildrenRef", term251478);
        setField(term251474, term251474.getClass(), "childNodes", term251481);
        setIntField(term251483, term251483.getClass(), "size", -1498296052);
        setField(term251483, term251483.getClass(), "keys", term251484);
        setField(term251483, term251483.getClass(), "vals", term251485);
        setField(term251474, term251474.getClass(), "attributes", term251483);
        setField(term251474, term251474.getClass(), "baseUri", "lihXWlGDxk");
        setField(term251474, term251474.getClass(), "parentNode", null);
        setIntField(term251474, term251474.getClass(), "siblingIndex", 2098647989);
        term251470 = newInstance(Class.forName("org.jsoup.select.Elements"));
        Object[] term251471 = (Object[]) newArray("java.lang.Object", 0);
        setField(term251470, term251470.getClass(), "elementData", term251471);
        setIntField(term251470, term251470.getClass(), "size", 0);
        setIntField(term251470, term251470.getClass(), "modCount", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term5354;
        Object retValue = callMethod(klass, "getElementsByIndexLessThan", argTypes, term5307, args);
        assertTrue(recursiveEquals(term5307, term251474));
        assertTrue(recursiveEquals(term5354, 1598895173));
        assertTrue(recursiveEquals(retValue, term251470));
    }

};


