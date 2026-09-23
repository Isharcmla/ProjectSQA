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

public class Element_getElementsByAttributeStarting_70511072063 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4566;

    public Element_getElementsByAttributeStarting_70511072063() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term4592 = new ArrayList();
        ((ArrayList) term4592).add((Object)null);
        ((ArrayList) term4592).add((Object)null);
        ((ArrayList) term4592).add((Object)null);
        ((ArrayList) term4592).add((Object)null);
        ((ArrayList) term4592).add((Object)null);
        ((ArrayList) term4592).add((Object)null);
        ((ArrayList) term4592).add((Object)null);
        ((ArrayList) term4592).add((Object)null);
        term4566 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term4567 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term4588 = newInstance(Class.forName("java.lang.ref.WeakReference"));
        Object term4589 = newInstance(Class.forName("java.lang.ref.ReferenceQueue"));
        Object term4590 = newInstance(Class.forName("java.lang.ref.ReferenceQueue$Lock"));
        Object term4596 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term4598 = (Object[]) newArray("java.lang.String", 0);
        Object[] term4599 = (Object[]) newArray("java.lang.String", 0);
        setField(term4567, term4567.getClass(), "tagName", "WHcwFgsGFC");
        setBooleanField(term4567, term4567.getClass(), "isBlock", true);
        setBooleanField(term4567, term4567.getClass(), "formatAsBlock", false);
        setBooleanField(term4567, term4567.getClass(), "canContainInline", true);
        setBooleanField(term4567, term4567.getClass(), "empty", false);
        setBooleanField(term4567, term4567.getClass(), "selfClosing", false);
        setBooleanField(term4567, term4567.getClass(), "preserveWhitespace", true);
        setBooleanField(term4567, term4567.getClass(), "formList", true);
        setBooleanField(term4567, term4567.getClass(), "formSubmit", false);
        setField(term4566, term4566.getClass(), "tag", term4567);
        setField(term4588, term4588.getClass(), "referent", null);
        setField(term4589, term4589.getClass(), "lock", term4590);
        setField(term4589, term4589.getClass(), "head", null);
        setLongField(term4589, term4589.getClass(), "queueLength", 7994303628307559416L);
        setField(term4588, term4588.getClass(), "queue", term4589);
        setField(term4588, term4588.getClass(), "next", null);
        setField(term4588, term4588.getClass(), "discovered", null);
        setField(term4566, term4566.getClass(), "shadowChildrenRef", term4588);
        setField(term4566, term4566.getClass(), "childNodes", term4592);
        setIntField(term4596, term4596.getClass(), "size", -375014958);
        setField(term4596, term4596.getClass(), "keys", term4598);
        setField(term4596, term4596.getClass(), "vals", term4599);
        setField(term4566, term4566.getClass(), "attributes", term4596);
        setField(term4566, term4566.getClass(), "baseUri", "HzqpegHiRq");
        setField(term4566, term4566.getClass(), "parentNode", null);
        setIntField(term4566, term4566.getClass(), "siblingIndex", 1107176718);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "jwsfVjMoJT";
        callMethod(klass, "getElementsByAttributeStarting", argTypes, term4566, args);
    }

};


