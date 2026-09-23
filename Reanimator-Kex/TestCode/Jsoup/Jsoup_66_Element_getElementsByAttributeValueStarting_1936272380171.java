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

public class Element_getElementsByAttributeValueStarting_1936272380171 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4674;
     Object term29683;
     Object term29679;

    public Element_getElementsByAttributeValueStarting_1936272380171() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term4700 = new ArrayList();
        ((ArrayList) term4700).add((Object)null);
        ((ArrayList) term4700).add((Object)null);
        ((ArrayList) term4700).add((Object)null);
        ((ArrayList) term4700).add((Object)null);
        ((ArrayList) term4700).add((Object)null);
        ((ArrayList) term4700).add((Object)null);
        ((ArrayList) term4700).add((Object)null);
        ((ArrayList) term4700).add((Object)null);
        term4674 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term4675 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term4696 = newInstance(Class.forName("java.lang.ref.WeakReference"));
        Object term4697 = newInstance(Class.forName("java.lang.ref.ReferenceQueue"));
        Object term4698 = newInstance(Class.forName("java.lang.ref.ReferenceQueue$Lock"));
        Object term4704 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term4706 = (Object[]) newArray("java.lang.String", 0);
        Object[] term4707 = (Object[]) newArray("java.lang.String", 0);
        setField(term4675, term4675.getClass(), "tagName", "VYkqXKVlAJ");
        setBooleanField(term4675, term4675.getClass(), "isBlock", true);
        setBooleanField(term4675, term4675.getClass(), "formatAsBlock", false);
        setBooleanField(term4675, term4675.getClass(), "canContainInline", true);
        setBooleanField(term4675, term4675.getClass(), "empty", false);
        setBooleanField(term4675, term4675.getClass(), "selfClosing", false);
        setBooleanField(term4675, term4675.getClass(), "preserveWhitespace", true);
        setBooleanField(term4675, term4675.getClass(), "formList", true);
        setBooleanField(term4675, term4675.getClass(), "formSubmit", false);
        setField(term4674, term4674.getClass(), "tag", term4675);
        setField(term4696, term4696.getClass(), "referent", null);
        setField(term4697, term4697.getClass(), "lock", term4698);
        setField(term4697, term4697.getClass(), "head", null);
        setLongField(term4697, term4697.getClass(), "queueLength", 7994303628307559416L);
        setField(term4696, term4696.getClass(), "queue", term4697);
        setField(term4696, term4696.getClass(), "next", null);
        setField(term4696, term4696.getClass(), "discovered", null);
        setField(term4674, term4674.getClass(), "shadowChildrenRef", term4696);
        setField(term4674, term4674.getClass(), "childNodes", term4700);
        setIntField(term4704, term4704.getClass(), "size", -375014958);
        setField(term4704, term4704.getClass(), "keys", term4706);
        setField(term4704, term4704.getClass(), "vals", term4707);
        setField(term4674, term4674.getClass(), "attributes", term4704);
        setField(term4674, term4674.getClass(), "baseUri", "XkIoWJRNwN");
        setField(term4674, term4674.getClass(), "parentNode", null);
        setIntField(term4674, term4674.getClass(), "siblingIndex", 1107176718);
        ArrayList term29690 = new ArrayList();
        ((ArrayList) term29690).add((Object)null);
        ((ArrayList) term29690).add((Object)null);
        ((ArrayList) term29690).add((Object)null);
        ((ArrayList) term29690).add((Object)null);
        ((ArrayList) term29690).add((Object)null);
        ((ArrayList) term29690).add((Object)null);
        ((ArrayList) term29690).add((Object)null);
        ((ArrayList) term29690).add((Object)null);
        term29683 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term29684 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term29687 = newInstance(Class.forName("java.lang.ref.WeakReference"));
        Object term29688 = newInstance(Class.forName("java.lang.ref.ReferenceQueue"));
        Object term29689 = newInstance(Class.forName("java.lang.ref.ReferenceQueue$Lock"));
        Object term29692 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term29693 = (Object[]) newArray("java.lang.String", 0);
        Object[] term29694 = (Object[]) newArray("java.lang.String", 0);
        setField(term29684, term29684.getClass(), "tagName", "VYkqXKVlAJ");
        setBooleanField(term29684, term29684.getClass(), "isBlock", true);
        setBooleanField(term29684, term29684.getClass(), "formatAsBlock", false);
        setBooleanField(term29684, term29684.getClass(), "canContainInline", true);
        setBooleanField(term29684, term29684.getClass(), "empty", false);
        setBooleanField(term29684, term29684.getClass(), "selfClosing", false);
        setBooleanField(term29684, term29684.getClass(), "preserveWhitespace", true);
        setBooleanField(term29684, term29684.getClass(), "formList", true);
        setBooleanField(term29684, term29684.getClass(), "formSubmit", false);
        setField(term29683, term29683.getClass(), "tag", term29684);
        setField(term29687, term29687.getClass(), "referent", null);
        setField(term29688, term29688.getClass(), "lock", term29689);
        setField(term29688, term29688.getClass(), "head", null);
        setLongField(term29688, term29688.getClass(), "queueLength", 7994303628307559416L);
        setField(term29687, term29687.getClass(), "queue", term29688);
        setField(term29687, term29687.getClass(), "next", null);
        setField(term29687, term29687.getClass(), "discovered", null);
        setField(term29683, term29683.getClass(), "shadowChildrenRef", term29687);
        setField(term29683, term29683.getClass(), "childNodes", term29690);
        setIntField(term29692, term29692.getClass(), "size", -375014958);
        setField(term29692, term29692.getClass(), "keys", term29693);
        setField(term29692, term29692.getClass(), "vals", term29694);
        setField(term29683, term29683.getClass(), "attributes", term29692);
        setField(term29683, term29683.getClass(), "baseUri", "XkIoWJRNwN");
        setField(term29683, term29683.getClass(), "parentNode", null);
        setIntField(term29683, term29683.getClass(), "siblingIndex", 1107176718);
        term29679 = newInstance(Class.forName("org.jsoup.select.Elements"));
        Object[] term29680 = (Object[]) newArray("java.lang.Object", 0);
        setField(term29679, term29679.getClass(), "elementData", term29680);
        setIntField(term29679, term29679.getClass(), "size", 0);
        setIntField(term29679, term29679.getClass(), "modCount", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = "aNWLJdrZMq";
        args[1] = "HHmNoYxIGj";
        Object retValue = callMethod(klass, "getElementsByAttributeValueStarting", argTypes, term4674, args);
        assertTrue(recursiveEquals(term4674, term29683));
        assertTrue(recursiveEquals(retValue, term29679));
    }

};


