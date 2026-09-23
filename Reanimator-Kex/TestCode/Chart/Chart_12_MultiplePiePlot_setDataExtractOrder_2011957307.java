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

public class MultiplePiePlot_setDataExtractOrder_2011957307 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term950;
     Object term1079;

    public MultiplePiePlot_setDataExtractOrder_2011957307() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term1005 = new ArrayList();
        ArrayList term1049 = new ArrayList();
        term950 = newInstance(Class.forName("org.jfree.chart.plot.MultiplePiePlot"));
        Object term951 = newInstance(Class.forName("org.jfree.chart.JFreeChart"));
        Object term952 = newInstance(Class.forName("java.awt.RenderingHints"));
        Object term954 = newInstance(Class.forName("org.jfree.chart.util.RectangleInsets"));
        Object term955 = newInstance(Class.forName("org.jfree.chart.util.UnitType"));
        Object term961 = newInstance(Class.forName("org.jfree.chart.title.TextTitle"));
        Object term964 = newInstance(Class.forName("java.awt.Font"));
        Object term975 = newInstance(Class.forName("org.jfree.chart.util.HorizontalAlignment"));
        Object term977 = newInstance(Class.forName("java.awt.Color"));
        Object term1004 = newInstance(Class.forName("org.jfree.chart.text.TextBlock"));
        Object term1009 = newInstance(Class.forName("org.jfree.chart.util.RectangleEdge"));
        Object term1011 = newInstance(Class.forName("org.jfree.chart.util.VerticalAlignment"));
        Object term1013 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term1014 = (Object[]) newArray("java.lang.Object", 0);
        Object term1028 = newInstance(Class.forName("org.jfree.chart.util.RectangleInsets"));
        Object term1033 = newInstance(Class.forName("org.jfree.chart.block.BlockBorder"));
        Object term1034 = newInstance(Class.forName("java.awt.Color"));
        Object term1037 = newInstance(Class.forName("org.jfree.chart.util.RectangleInsets"));
        Object term1044 = newInstance(Class.forName("java.awt.geom.Rectangle2D$Float"));
        Object term1055 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term1056 = (Object[]) newArray("java.lang.Object", 0);
        Object term1057 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term1058 = (Object[]) newArray("java.lang.Object", 0);
        Object term1060 = newInstance(Class.forName("org.jfree.chart.util.TableOrder"));
        setField(term952, term952.getClass(), "hintmap", null);
        setField(term951, term951.getClass(), "renderingHints", term952);
        setBooleanField(term951, term951.getClass(), "borderVisible", false);
        setField(term951, term951.getClass(), "borderStroke", null);
        setField(term951, term951.getClass(), "borderPaint", null);
        setField(term955, term955.getClass(), "name", "");
        setField(term954, term954.getClass(), "unitType", term955);
        setDoubleField(term954, term954.getClass(), "top", 1.0);
        setDoubleField(term954, term954.getClass(), "left", 1.0);
        setDoubleField(term954, term954.getClass(), "bottom", 1.0);
        setDoubleField(term954, term954.getClass(), "right", 1.0);
        setField(term951, term951.getClass(), "padding", term954);
        setField(term961, term961.getClass(), "text", "");
        setField(term964, term964.getClass(), "fRequestedAttributes", null);
        setField(term964, term964.getClass(), "name", "");
        setIntField(term964, term964.getClass(), "style", 1);
        setIntField(term964, term964.getClass(), "size", 12);
        setFloatField(term964, term964.getClass(), "pointSize", 12.0F);
        setField(term964, term964.getClass(), "peer", null);
        setLongField(term964, term964.getClass(), "pData", 0L);
        setField(term964, term964.getClass(), "font2DHandle", null);
        setField(term964, term964.getClass(), "values", null);
        setBooleanField(term964, term964.getClass(), "hasLayoutAttributes", false);
        setBooleanField(term964, term964.getClass(), "createdFont", false);
        setBooleanField(term964, term964.getClass(), "nonIdentityTx", false);
        setIntField(term964, term964.getClass(), "hash", 0);
        setIntField(term964, term964.getClass(), "fontSerializedDataVersion", 1);
        setField(term964, term964.getClass(), "flmref", null);
        setField(term961, term961.getClass(), "font", term964);
        setField(term975, term975.getClass(), "name", "");
        setField(term961, term961.getClass(), "textAlignment", term975);
        setIntField(term977, term977.getClass(), "value", -16777216);
        setField(term977, term977.getClass(), "frgbvalue", null);
        setField(term977, term977.getClass(), "fvalue", null);
        setFloatField(term977, term977.getClass(), "falpha", 0.0F);
        setField(term977, term977.getClass(), "cs", null);
        setField(term961, term961.getClass(), "paint", term977);
        setField(term961, term961.getClass(), "backgroundPaint", null);
        setField(term961, term961.getClass(), "toolTipText", "eZFUvlxvGV");
        setField(term961, term961.getClass(), "urlText", "BYqFIqCKAV");
        setField(term1004, term1004.getClass(), "lines", term1005);
        setField(term1004, term1004.getClass(), "lineAlignment", term975);
        setField(term961, term961.getClass(), "content", term1004);
        setBooleanField(term961, term961.getClass(), "expandToFitSpace", false);
        setField(term1009, term1009.getClass(), "name", "");
        setField(term961, term961.getClass(), "position", term1009);
        setField(term961, term961.getClass(), "horizontalAlignment", term975);
        setField(term1011, term1011.getClass(), "name", "");
        setField(term961, term961.getClass(), "verticalAlignment", term1011);
        setField(term1013, term1013.getClass(), "listenerList", term1014);
        setField(term961, term961.getClass(), "listenerList", term1013);
        setBooleanField(term961, term961.getClass(), "notify", true);
        setField(term961, term961.getClass(), "id", "vrQLuWIDJX");
        setField(term1028, term1028.getClass(), "unitType", term955);
        setDoubleField(term1028, term1028.getClass(), "top", 0.0);
        setDoubleField(term1028, term1028.getClass(), "left", 0.0);
        setDoubleField(term1028, term1028.getClass(), "bottom", 0.0);
        setDoubleField(term1028, term1028.getClass(), "right", 0.0);
        setField(term961, term961.getClass(), "margin", term1028);
        setField(term1033, term1033.getClass(), "insets", term1028);
        setIntField(term1034, term1034.getClass(), "value", -1);
        setField(term1034, term1034.getClass(), "frgbvalue", null);
        setField(term1034, term1034.getClass(), "fvalue", null);
        setFloatField(term1034, term1034.getClass(), "falpha", 0.0F);
        setField(term1034, term1034.getClass(), "cs", null);
        setField(term1033, term1033.getClass(), "paint", term1034);
        setField(term961, term961.getClass(), "frame", term1033);
        setField(term1037, term1037.getClass(), "unitType", term955);
        setDoubleField(term1037, term1037.getClass(), "top", 1.0);
        setDoubleField(term1037, term1037.getClass(), "left", 1.0);
        setDoubleField(term1037, term1037.getClass(), "bottom", 1.0);
        setDoubleField(term1037, term1037.getClass(), "right", 1.0);
        setField(term961, term961.getClass(), "padding", term1037);
        setDoubleField(term961, term961.getClass(), "width", 0.2779719046761513);
        setDoubleField(term961, term961.getClass(), "height", 0.6436713023569729);
        setFloatField(term1044, term1044.getClass(), "x", 0.0F);
        setFloatField(term1044, term1044.getClass(), "y", 0.0F);
        setFloatField(term1044, term1044.getClass(), "width", 0.0F);
        setFloatField(term1044, term1044.getClass(), "height", 0.0F);
        setField(term961, term961.getClass(), "bounds", term1044);
        setField(term951, term951.getClass(), "title", term961);
        setField(term951, term951.getClass(), "subtitles", term1049);
        setField(term951, term951.getClass(), "plot", null);
        setField(term951, term951.getClass(), "backgroundPaint", null);
        setField(term951, term951.getClass(), "backgroundImage", null);
        setIntField(term951, term951.getClass(), "backgroundImageAlignment", -1955890973);
        setFloatField(term951, term951.getClass(), "backgroundImageAlpha", 0.5446086F);
        setField(term1055, term1055.getClass(), "listenerList", term1056);
        setField(term951, term951.getClass(), "changeListeners", term1055);
        setField(term1057, term1057.getClass(), "listenerList", term1058);
        setField(term951, term951.getClass(), "progressListeners", term1057);
        setBooleanField(term951, term951.getClass(), "notify", true);
        setField(term950, term950.getClass(), "pieChart", term951);
        setField(term950, term950.getClass(), "dataset", null);
        setField(term1060, term1060.getClass(), "name", "flxyYxBRtu");
        setField(term950, term950.getClass(), "dataExtractOrder", term1060);
        setDoubleField(term950, term950.getClass(), "limit", 0.7332741045694002);
        setField(term950, term950.getClass(), "aggregatedItemsKey", null);
        setField(term950, term950.getClass(), "aggregatedItemsPaint", null);
        setField(term950, term950.getClass(), "sectionPaints", null);
        setField(term950, term950.getClass(), "parent", null);
        setField(term950, term950.getClass(), "datasetGroup", null);
        setField(term950, term950.getClass(), "noDataMessage", null);
        setField(term950, term950.getClass(), "noDataMessageFont", null);
        setField(term950, term950.getClass(), "noDataMessagePaint", null);
        setField(term950, term950.getClass(), "insets", null);
        setBooleanField(term950, term950.getClass(), "outlineVisible", false);
        setField(term950, term950.getClass(), "outlineStroke", null);
        setField(term950, term950.getClass(), "outlinePaint", null);
        setField(term950, term950.getClass(), "backgroundPaint", null);
        setField(term950, term950.getClass(), "backgroundImage", null);
        setIntField(term950, term950.getClass(), "backgroundImageAlignment", 0);
        setFloatField(term950, term950.getClass(), "backgroundImageAlpha", 0.0F);
        setFloatField(term950, term950.getClass(), "foregroundAlpha", 0.0F);
        setFloatField(term950, term950.getClass(), "backgroundAlpha", 0.0F);
        setField(term950, term950.getClass(), "drawingSupplier", null);
        setField(term950, term950.getClass(), "listenerList", null);
        term1079 = newInstance(Class.forName("org.jfree.chart.util.TableOrder"));
        setField(term1079, term1079.getClass(), "name", "OclPbYPkcH");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.chart.plot.MultiplePiePlot");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jfree.chart.util.TableOrder");
        Object[] args = new Object[1];
        args[0] = term1079;
        callMethod(klass, "setDataExtractOrder", argTypes, term950, args);
    }

};


