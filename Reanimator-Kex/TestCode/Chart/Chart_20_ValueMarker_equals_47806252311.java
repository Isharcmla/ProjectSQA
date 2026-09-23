package org.jfree.chart.plot;

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
import static org.jfree.chart.plot.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.jfree.chart.plot.EqualityUtils.*;
import java.lang.Object;

public class ValueMarker_equals_47806252311 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term145;
     Object term192;
     Object term2109;
     Object term2119;

    public ValueMarker_equals_47806252311() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term145 = newInstance(Class.forName("org.jfree.chart.plot.ValueMarker"));
        Object term160 = newInstance(Class.forName("java.awt.Font"));
        Object term161 = newInstance(Class.forName("java.util.Hashtable"));
        Object[] term162 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object term163 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term190 = newInstance(Class.forName("java.lang.ref.SoftReference"));
        setDoubleField(term145, term145.getClass(), "value", 0.2641345529914265);
        setField(term145, term145.getClass(), "paint", null);
        setField(term145, term145.getClass(), "stroke", null);
        setField(term145, term145.getClass(), "outlinePaint", null);
        setField(term145, term145.getClass(), "outlineStroke", null);
        setFloatField(term145, term145.getClass(), "alpha", 0.8564069F);
        setField(term145, term145.getClass(), "label", "jJCZpVmanW");
        setIntField(term163, term163.getClass(), "hash", 968844412);
        setField(term163, term163.getClass(), "key", null);
        setField(term163, term163.getClass(), "value", null);
        setField(term163, term163.getClass(), "next", null);
        setElement(term162, 8, term163);
        setField(term161, term161.getClass(), "table", term162);
        setIntField(term161, term161.getClass(), "count", 1);
        setIntField(term161, term161.getClass(), "threshold", 8);
        setFloatField(term161, term161.getClass(), "loadFactor", 0.75F);
        setIntField(term161, term161.getClass(), "modCount", 1);
        setField(term161, term161.getClass(), "keySet", null);
        setField(term161, term161.getClass(), "entrySet", null);
        setField(term161, term161.getClass(), "values", null);
        setField(term160, term160.getClass(), "fRequestedAttributes", term161);
        setField(term160, term160.getClass(), "name", "EGtDIRbSSb");
        setIntField(term160, term160.getClass(), "style", 1048535127);
        setIntField(term160, term160.getClass(), "size", -655067527);
        setFloatField(term160, term160.getClass(), "pointSize", 0.5446086F);
        setField(term160, term160.getClass(), "peer", null);
        setLongField(term160, term160.getClass(), "pData", -8257434502486459194L);
        setField(term160, term160.getClass(), "font2DHandle", null);
        setField(term160, term160.getClass(), "values", null);
        setBooleanField(term160, term160.getClass(), "hasLayoutAttributes", true);
        setBooleanField(term160, term160.getClass(), "createdFont", true);
        setBooleanField(term160, term160.getClass(), "nonIdentityTx", false);
        setIntField(term160, term160.getClass(), "hash", -6029667);
        setIntField(term160, term160.getClass(), "fontSerializedDataVersion", -2068769794);
        setLongField(term190, term190.getClass(), "timestamp", 0L);
        setField(term190, term190.getClass(), "referent", null);
        setField(term190, term190.getClass(), "queue", null);
        setField(term190, term190.getClass(), "next", null);
        setField(term190, term190.getClass(), "discovered", null);
        setField(term160, term160.getClass(), "flmref", term190);
        setField(term145, term145.getClass(), "labelFont", term160);
        setField(term145, term145.getClass(), "labelPaint", null);
        setField(term145, term145.getClass(), "labelAnchor", null);
        setField(term145, term145.getClass(), "labelTextAnchor", null);
        setField(term145, term145.getClass(), "labelOffset", null);
        setField(term145, term145.getClass(), "labelOffsetType", null);
        setField(term145, term145.getClass(), "listenerList", null);
        term192 = newInstance(Class.forName("java.lang.Object"));
        term2109 = newInstance(Class.forName("org.jfree.chart.plot.ValueMarker"));
        Object term2112 = newInstance(Class.forName("java.awt.Font"));
        Object term2113 = newInstance(Class.forName("java.util.Hashtable"));
        Object[] term2114 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object term2115 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term2118 = newInstance(Class.forName("java.lang.ref.SoftReference"));
        setDoubleField(term2109, term2109.getClass(), "value", 0.2641345529914265);
        setField(term2109, term2109.getClass(), "paint", null);
        setField(term2109, term2109.getClass(), "stroke", null);
        setField(term2109, term2109.getClass(), "outlinePaint", null);
        setField(term2109, term2109.getClass(), "outlineStroke", null);
        setFloatField(term2109, term2109.getClass(), "alpha", 0.8564069F);
        setField(term2109, term2109.getClass(), "label", "jJCZpVmanW");
        setIntField(term2115, term2115.getClass(), "hash", 968844412);
        setField(term2115, term2115.getClass(), "key", null);
        setField(term2115, term2115.getClass(), "value", null);
        setField(term2115, term2115.getClass(), "next", null);
        setElement(term2114, 8, term2115);
        setField(term2113, term2113.getClass(), "table", term2114);
        setIntField(term2113, term2113.getClass(), "count", 1);
        setIntField(term2113, term2113.getClass(), "threshold", 8);
        setFloatField(term2113, term2113.getClass(), "loadFactor", 0.75F);
        setIntField(term2113, term2113.getClass(), "modCount", 1);
        setField(term2113, term2113.getClass(), "keySet", null);
        setField(term2113, term2113.getClass(), "entrySet", null);
        setField(term2113, term2113.getClass(), "values", null);
        setField(term2112, term2112.getClass(), "fRequestedAttributes", term2113);
        setField(term2112, term2112.getClass(), "name", "EGtDIRbSSb");
        setIntField(term2112, term2112.getClass(), "style", 1048535127);
        setIntField(term2112, term2112.getClass(), "size", -655067527);
        setFloatField(term2112, term2112.getClass(), "pointSize", 0.5446086F);
        setField(term2112, term2112.getClass(), "peer", null);
        setLongField(term2112, term2112.getClass(), "pData", -8257434502486459194L);
        setField(term2112, term2112.getClass(), "font2DHandle", null);
        setField(term2112, term2112.getClass(), "values", null);
        setBooleanField(term2112, term2112.getClass(), "hasLayoutAttributes", true);
        setBooleanField(term2112, term2112.getClass(), "createdFont", true);
        setBooleanField(term2112, term2112.getClass(), "nonIdentityTx", false);
        setIntField(term2112, term2112.getClass(), "hash", -6029667);
        setIntField(term2112, term2112.getClass(), "fontSerializedDataVersion", -2068769794);
        setLongField(term2118, term2118.getClass(), "timestamp", 0L);
        setField(term2118, term2118.getClass(), "referent", null);
        setField(term2118, term2118.getClass(), "queue", null);
        setField(term2118, term2118.getClass(), "next", null);
        setField(term2118, term2118.getClass(), "discovered", null);
        setField(term2112, term2112.getClass(), "flmref", term2118);
        setField(term2109, term2109.getClass(), "labelFont", term2112);
        setField(term2109, term2109.getClass(), "labelPaint", null);
        setField(term2109, term2109.getClass(), "labelAnchor", null);
        setField(term2109, term2109.getClass(), "labelTextAnchor", null);
        setField(term2109, term2109.getClass(), "labelOffset", null);
        setField(term2109, term2109.getClass(), "labelOffsetType", null);
        setField(term2109, term2109.getClass(), "listenerList", null);
        term2119 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.chart.plot.ValueMarker");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term192;
        Object retValue = callMethod(klass, "equals", argTypes, term145, args);
        assertTrue(recursiveEquals(term145, term2109));
        assertTrue(recursiveEquals(term192, term2119));
        assertTrue(recursiveEquals(retValue, false));
    }

};


