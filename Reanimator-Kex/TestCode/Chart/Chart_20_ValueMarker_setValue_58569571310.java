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
import java.lang.NullPointerException;
import static org.jfree.chart.plot.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Double;

public class ValueMarker_setValue_58569571310 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term76;
     Object term123;

    public ValueMarker_setValue_58569571310() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term76 = newInstance(Class.forName("org.jfree.chart.plot.ValueMarker"));
        Object term91 = newInstance(Class.forName("java.awt.Font"));
        Object term92 = newInstance(Class.forName("java.util.Hashtable"));
        Object[] term93 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object term94 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term121 = newInstance(Class.forName("java.lang.ref.SoftReference"));
        setDoubleField(term76, term76.getClass(), "value", 0.28570734989730284);
        setField(term76, term76.getClass(), "paint", null);
        setField(term76, term76.getClass(), "stroke", null);
        setField(term76, term76.getClass(), "outlinePaint", null);
        setField(term76, term76.getClass(), "outlineStroke", null);
        setFloatField(term76, term76.getClass(), "alpha", 0.09123778F);
        setField(term76, term76.getClass(), "label", "MuLcgQHgqz");
        setIntField(term94, term94.getClass(), "hash", 330011774);
        setField(term94, term94.getClass(), "key", null);
        setField(term94, term94.getClass(), "value", null);
        setField(term94, term94.getClass(), "next", null);
        setElement(term93, 4, term94);
        setField(term92, term92.getClass(), "table", term93);
        setIntField(term92, term92.getClass(), "count", 1);
        setIntField(term92, term92.getClass(), "threshold", 8);
        setFloatField(term92, term92.getClass(), "loadFactor", 0.75F);
        setIntField(term92, term92.getClass(), "modCount", 1);
        setField(term92, term92.getClass(), "keySet", null);
        setField(term92, term92.getClass(), "entrySet", null);
        setField(term92, term92.getClass(), "values", null);
        setField(term91, term91.getClass(), "fRequestedAttributes", term92);
        setField(term91, term91.getClass(), "name", "xxtlPwDYFs");
        setIntField(term91, term91.getClass(), "style", -522618178);
        setIntField(term91, term91.getClass(), "size", 1134449235);
        setFloatField(term91, term91.getClass(), "pointSize", 0.5523636F);
        setField(term91, term91.getClass(), "peer", null);
        setLongField(term91, term91.getClass(), "pData", 6375119433582206027L);
        setField(term91, term91.getClass(), "font2DHandle", null);
        setField(term91, term91.getClass(), "values", null);
        setBooleanField(term91, term91.getClass(), "hasLayoutAttributes", false);
        setBooleanField(term91, term91.getClass(), "createdFont", true);
        setBooleanField(term91, term91.getClass(), "nonIdentityTx", true);
        setIntField(term91, term91.getClass(), "hash", -883034806);
        setIntField(term91, term91.getClass(), "fontSerializedDataVersion", 1585847225);
        setLongField(term121, term121.getClass(), "timestamp", 0L);
        setField(term121, term121.getClass(), "referent", null);
        setField(term121, term121.getClass(), "queue", null);
        setField(term121, term121.getClass(), "next", null);
        setField(term121, term121.getClass(), "discovered", null);
        setField(term91, term91.getClass(), "flmref", term121);
        setField(term76, term76.getClass(), "labelFont", term91);
        setField(term76, term76.getClass(), "labelPaint", null);
        setField(term76, term76.getClass(), "labelAnchor", null);
        setField(term76, term76.getClass(), "labelTextAnchor", null);
        setField(term76, term76.getClass(), "labelOffset", null);
        setField(term76, term76.getClass(), "labelOffsetType", null);
        setField(term76, term76.getClass(), "listenerList", null);
        term123 = new Double(0.40176586625454525);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.chart.plot.ValueMarker");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = double.class;
        Object[] args = new Object[1];
        args[0] = term123;
        try {
            callMethod(klass, "setValue", argTypes, term76, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


