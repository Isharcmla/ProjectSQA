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

public class Element_getElementsByIndexLessThan_751556693176 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5307;
     Object term5354;
     Object term32511;
     Object term32507;

    public Element_getElementsByIndexLessThan_751556693176() {
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
        setBooleanField(term5308, term5308.getClass(), "selfClosing", true);
        setBooleanField(term5308, term5308.getClass(), "preserveWhitespace", false);
        setBooleanField(term5308, term5308.getClass(), "formList", false);
        setBooleanField(term5308, term5308.getClass(), "formSubmit", false);
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
        ArrayList term32518 = new ArrayList();
        ((ArrayList) term32518).add((Object)null);
        ((ArrayList) term32518).add((Object)null);
        ((ArrayList) term32518).add((Object)null);
        term32511 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term32512 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term32515 = newInstance(Class.forName("java.lang.ref.WeakReference"));
        Object term32516 = newInstance(Class.forName("java.lang.ref.ReferenceQueue"));
        Object term32517 = newInstance(Class.forName("java.lang.ref.ReferenceQueue$Lock"));
        Object term32520 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term32521 = (Object[]) newArray("java.lang.String", 0);
        Object[] term32522 = (Object[]) newArray("java.lang.String", 0);
        setField(term32512, term32512.getClass(), "tagName", "cudZvLMQon");
        setBooleanField(term32512, term32512.getClass(), "isBlock", false);
        setBooleanField(term32512, term32512.getClass(), "formatAsBlock", true);
        setBooleanField(term32512, term32512.getClass(), "canContainInline", false);
        setBooleanField(term32512, term32512.getClass(), "empty", false);
        setBooleanField(term32512, term32512.getClass(), "selfClosing", true);
        setBooleanField(term32512, term32512.getClass(), "preserveWhitespace", false);
        setBooleanField(term32512, term32512.getClass(), "formList", false);
        setBooleanField(term32512, term32512.getClass(), "formSubmit", false);
        setField(term32511, term32511.getClass(), "tag", term32512);
        setField(term32515, term32515.getClass(), "referent", null);
        setField(term32516, term32516.getClass(), "lock", term32517);
        setField(term32516, term32516.getClass(), "head", null);
        setLongField(term32516, term32516.getClass(), "queueLength", 414749984815662075L);
        setField(term32515, term32515.getClass(), "queue", term32516);
        setField(term32515, term32515.getClass(), "next", null);
        setField(term32515, term32515.getClass(), "discovered", null);
        setField(term32511, term32511.getClass(), "shadowChildrenRef", term32515);
        setField(term32511, term32511.getClass(), "childNodes", term32518);
        setIntField(term32520, term32520.getClass(), "size", -1498296052);
        setField(term32520, term32520.getClass(), "keys", term32521);
        setField(term32520, term32520.getClass(), "vals", term32522);
        setField(term32511, term32511.getClass(), "attributes", term32520);
        setField(term32511, term32511.getClass(), "baseUri", "lihXWlGDxk");
        setField(term32511, term32511.getClass(), "parentNode", null);
        setIntField(term32511, term32511.getClass(), "siblingIndex", 2098647989);
        term32507 = newInstance(Class.forName("org.jsoup.select.Elements"));
        Object[] term32508 = (Object[]) newArray("java.lang.Object", 0);
        setField(term32507, term32507.getClass(), "elementData", term32508);
        setIntField(term32507, term32507.getClass(), "size", 0);
        setIntField(term32507, term32507.getClass(), "modCount", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term5354;
        Object retValue = callMethod(klass, "getElementsByIndexLessThan", argTypes, term5307, args);
        assertTrue(recursiveEquals(term5307, term32511));
        assertTrue(recursiveEquals(term5354, 1598895173));
        assertTrue(recursiveEquals(retValue, term32507));
    }

};


