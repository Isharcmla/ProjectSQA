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
import java.lang.Object;
import java.util.ArrayList;

public class MultiplePiePlot_getPlotType_160709777514 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2158;

    public MultiplePiePlot_getPlotType_160709777514() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term2213 = new ArrayList();
        ArrayList term2257 = new ArrayList();
        term2158 = newInstance(Class.forName("org.jfree.chart.plot.MultiplePiePlot"));
        Object term2159 = newInstance(Class.forName("org.jfree.chart.JFreeChart"));
        Object term2160 = newInstance(Class.forName("java.awt.RenderingHints"));
        Object term2162 = newInstance(Class.forName("org.jfree.chart.util.RectangleInsets"));
        Object term2163 = newInstance(Class.forName("org.jfree.chart.util.UnitType"));
        Object term2169 = newInstance(Class.forName("org.jfree.chart.title.TextTitle"));
        Object term2172 = newInstance(Class.forName("java.awt.Font"));
        Object term2183 = newInstance(Class.forName("org.jfree.chart.util.HorizontalAlignment"));
        Object term2185 = newInstance(Class.forName("java.awt.Color"));
        Object term2212 = newInstance(Class.forName("org.jfree.chart.text.TextBlock"));
        Object term2217 = newInstance(Class.forName("org.jfree.chart.util.RectangleEdge"));
        Object term2219 = newInstance(Class.forName("org.jfree.chart.util.VerticalAlignment"));
        Object term2221 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term2222 = (Object[]) newArray("java.lang.Object", 0);
        Object term2236 = newInstance(Class.forName("org.jfree.chart.util.RectangleInsets"));
        Object term2241 = newInstance(Class.forName("org.jfree.chart.block.BlockBorder"));
        Object term2242 = newInstance(Class.forName("java.awt.Color"));
        Object term2245 = newInstance(Class.forName("org.jfree.chart.util.RectangleInsets"));
        Object term2252 = newInstance(Class.forName("java.awt.geom.Rectangle2D$Float"));
        Object term2263 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term2264 = (Object[]) newArray("java.lang.Object", 0);
        Object term2265 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term2266 = (Object[]) newArray("java.lang.Object", 0);
        Object term2268 = newInstance(Class.forName("org.jfree.chart.util.TableOrder"));
        setField(term2160, term2160.getClass(), "hintmap", null);
        setField(term2159, term2159.getClass(), "renderingHints", term2160);
        setBooleanField(term2159, term2159.getClass(), "borderVisible", false);
        setField(term2159, term2159.getClass(), "borderStroke", null);
        setField(term2159, term2159.getClass(), "borderPaint", null);
        setField(term2163, term2163.getClass(), "name", "");
        setField(term2162, term2162.getClass(), "unitType", term2163);
        setDoubleField(term2162, term2162.getClass(), "top", 1.0);
        setDoubleField(term2162, term2162.getClass(), "left", 1.0);
        setDoubleField(term2162, term2162.getClass(), "bottom", 1.0);
        setDoubleField(term2162, term2162.getClass(), "right", 1.0);
        setField(term2159, term2159.getClass(), "padding", term2162);
        setField(term2169, term2169.getClass(), "text", "");
        setField(term2172, term2172.getClass(), "fRequestedAttributes", null);
        setField(term2172, term2172.getClass(), "name", "");
        setIntField(term2172, term2172.getClass(), "style", 1);
        setIntField(term2172, term2172.getClass(), "size", 12);
        setFloatField(term2172, term2172.getClass(), "pointSize", 12.0F);
        setField(term2172, term2172.getClass(), "peer", null);
        setLongField(term2172, term2172.getClass(), "pData", 0L);
        setField(term2172, term2172.getClass(), "font2DHandle", null);
        setField(term2172, term2172.getClass(), "values", null);
        setBooleanField(term2172, term2172.getClass(), "hasLayoutAttributes", false);
        setBooleanField(term2172, term2172.getClass(), "createdFont", false);
        setBooleanField(term2172, term2172.getClass(), "nonIdentityTx", false);
        setIntField(term2172, term2172.getClass(), "hash", 0);
        setIntField(term2172, term2172.getClass(), "fontSerializedDataVersion", 1);
        setField(term2172, term2172.getClass(), "flmref", null);
        setField(term2169, term2169.getClass(), "font", term2172);
        setField(term2183, term2183.getClass(), "name", "");
        setField(term2169, term2169.getClass(), "textAlignment", term2183);
        setIntField(term2185, term2185.getClass(), "value", -16777216);
        setField(term2185, term2185.getClass(), "frgbvalue", null);
        setField(term2185, term2185.getClass(), "fvalue", null);
        setFloatField(term2185, term2185.getClass(), "falpha", 0.0F);
        setField(term2185, term2185.getClass(), "cs", null);
        setField(term2169, term2169.getClass(), "paint", term2185);
        setField(term2169, term2169.getClass(), "backgroundPaint", null);
        setField(term2169, term2169.getClass(), "toolTipText", "UoYtihxVaS");
        setField(term2169, term2169.getClass(), "urlText", "JDswTTCZHV");
        setField(term2212, term2212.getClass(), "lines", term2213);
        setField(term2212, term2212.getClass(), "lineAlignment", term2183);
        setField(term2169, term2169.getClass(), "content", term2212);
        setBooleanField(term2169, term2169.getClass(), "expandToFitSpace", false);
        setField(term2217, term2217.getClass(), "name", "");
        setField(term2169, term2169.getClass(), "position", term2217);
        setField(term2169, term2169.getClass(), "horizontalAlignment", term2183);
        setField(term2219, term2219.getClass(), "name", "");
        setField(term2169, term2169.getClass(), "verticalAlignment", term2219);
        setField(term2221, term2221.getClass(), "listenerList", term2222);
        setField(term2169, term2169.getClass(), "listenerList", term2221);
        setBooleanField(term2169, term2169.getClass(), "notify", true);
        setField(term2169, term2169.getClass(), "id", "onpbIeEKoi");
        setField(term2236, term2236.getClass(), "unitType", term2163);
        setDoubleField(term2236, term2236.getClass(), "top", 0.0);
        setDoubleField(term2236, term2236.getClass(), "left", 0.0);
        setDoubleField(term2236, term2236.getClass(), "bottom", 0.0);
        setDoubleField(term2236, term2236.getClass(), "right", 0.0);
        setField(term2169, term2169.getClass(), "margin", term2236);
        setField(term2241, term2241.getClass(), "insets", term2236);
        setIntField(term2242, term2242.getClass(), "value", -1);
        setField(term2242, term2242.getClass(), "frgbvalue", null);
        setField(term2242, term2242.getClass(), "fvalue", null);
        setFloatField(term2242, term2242.getClass(), "falpha", 0.0F);
        setField(term2242, term2242.getClass(), "cs", null);
        setField(term2241, term2241.getClass(), "paint", term2242);
        setField(term2169, term2169.getClass(), "frame", term2241);
        setField(term2245, term2245.getClass(), "unitType", term2163);
        setDoubleField(term2245, term2245.getClass(), "top", 1.0);
        setDoubleField(term2245, term2245.getClass(), "left", 1.0);
        setDoubleField(term2245, term2245.getClass(), "bottom", 1.0);
        setDoubleField(term2245, term2245.getClass(), "right", 1.0);
        setField(term2169, term2169.getClass(), "padding", term2245);
        setDoubleField(term2169, term2169.getClass(), "width", 0.3202192021706908);
        setDoubleField(term2169, term2169.getClass(), "height", 0.22651340641904605);
        setFloatField(term2252, term2252.getClass(), "x", 0.0F);
        setFloatField(term2252, term2252.getClass(), "y", 0.0F);
        setFloatField(term2252, term2252.getClass(), "width", 0.0F);
        setFloatField(term2252, term2252.getClass(), "height", 0.0F);
        setField(term2169, term2169.getClass(), "bounds", term2252);
        setField(term2159, term2159.getClass(), "title", term2169);
        setField(term2159, term2159.getClass(), "subtitles", term2257);
        setField(term2159, term2159.getClass(), "plot", null);
        setField(term2159, term2159.getClass(), "backgroundPaint", null);
        setField(term2159, term2159.getClass(), "backgroundImage", null);
        setIntField(term2159, term2159.getClass(), "backgroundImageAlignment", -883034806);
        setFloatField(term2159, term2159.getClass(), "backgroundImageAlpha", 0.7944024F);
        setField(term2263, term2263.getClass(), "listenerList", term2264);
        setField(term2159, term2159.getClass(), "changeListeners", term2263);
        setField(term2265, term2265.getClass(), "listenerList", term2266);
        setField(term2159, term2159.getClass(), "progressListeners", term2265);
        setBooleanField(term2159, term2159.getClass(), "notify", false);
        setField(term2158, term2158.getClass(), "pieChart", term2159);
        setField(term2158, term2158.getClass(), "dataset", null);
        setField(term2268, term2268.getClass(), "name", "YRHGsAkhxb");
        setField(term2158, term2158.getClass(), "dataExtractOrder", term2268);
        setDoubleField(term2158, term2158.getClass(), "limit", 0.8878841294187743);
        setField(term2158, term2158.getClass(), "aggregatedItemsKey", null);
        setField(term2158, term2158.getClass(), "aggregatedItemsPaint", null);
        setField(term2158, term2158.getClass(), "sectionPaints", null);
        setField(term2158, term2158.getClass(), "parent", null);
        setField(term2158, term2158.getClass(), "datasetGroup", null);
        setField(term2158, term2158.getClass(), "noDataMessage", null);
        setField(term2158, term2158.getClass(), "noDataMessageFont", null);
        setField(term2158, term2158.getClass(), "noDataMessagePaint", null);
        setField(term2158, term2158.getClass(), "insets", null);
        setBooleanField(term2158, term2158.getClass(), "outlineVisible", false);
        setField(term2158, term2158.getClass(), "outlineStroke", null);
        setField(term2158, term2158.getClass(), "outlinePaint", null);
        setField(term2158, term2158.getClass(), "backgroundPaint", null);
        setField(term2158, term2158.getClass(), "backgroundImage", null);
        setIntField(term2158, term2158.getClass(), "backgroundImageAlignment", 0);
        setFloatField(term2158, term2158.getClass(), "backgroundImageAlpha", 0.0F);
        setFloatField(term2158, term2158.getClass(), "foregroundAlpha", 0.0F);
        setFloatField(term2158, term2158.getClass(), "backgroundAlpha", 0.0F);
        setField(term2158, term2158.getClass(), "drawingSupplier", null);
        setField(term2158, term2158.getClass(), "listenerList", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.chart.plot.MultiplePiePlot");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPlotType", argTypes, term2158, args);
    }

};


